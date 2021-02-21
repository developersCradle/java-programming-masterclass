# Section 16: Lambda Expressions

Lambda Expressions

# What I Learned
* Lambda expressions were introduced Java 8
	* Easier way to deal with interfaces with one method
		* With anonymous classes
		 ``` 
		 
		 new Thread(new Runnable() {  			
				@Override 
				public void run() {
						System.out.println("Printing from the Runnable!");	
					}
				}).start();
				
		```
			
* anonymous  class to create runnable OR
	* using class -> `` new Thread(new CodeToRun()).start(); ``
		
* Using lambda expressions `new Thread( () -> System.out.println("Printing from the Runnable!")).start();`
	* Lambda has three parts 
		* Argument list `()` in this case empty argument list
		* Arrow token `->`
		* Body code what we want to run, in this case `System.out.println("Printing from the Runnable!")`
* Compiler sees lambda expression ->  One of thread constructor accepts runnable parameter and it knows runnable interface has one method, which does not take any parameters -> Its able match lambda expressions argument list "no parameter" to run method 
	* Lambda needs to match to method -> lambda expressions can be used only with interfaces which contains only one method, which has to be implemented -> These interfaces are called functional interfaces
* Multiple line lambda, we are using {} if more than one statement
	```		
			new Thread( () -> {
			System.out.println("Printing from the Runnable!");
			System.out.println("line 2");
			System.out.println("This is line 3");
			}).start();
	```
* We can use Lambda with Comparator
	* Comparator has two abstract methods to implement
		* We just need to implement `compare(T o1, T o2)`
		* Since `equals(Object obj)` come as default method from Object
			* Therefore Comparator interface has really only one method which is needed to implemented
* To check if interface is replaceable by lambda, check the documentation
[Interface Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)
<img src="comparator.PNG" alt="alt text" width="400"/> 
* If we see anonymous class definition that only override one method
	* We can consider using lambda
* Using lambda with sort
	```
	
		   Collections.sort(employees, (employee1, employee2) ->
           employee1.getName().compareTo(employee2.getName()));
           
	```
* Lambdas are easy to see, what code will be ran
*`UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();`
	* When lambda body consist single statement which evaluates to single value, return statement is not needed
		* If in other hands if lambda consists more than one statement -> return keyword is needed
	* Here we are assigning lambda to variable and use it later
		* `Lambda expressions can be stored in variables if the variable's type is an interface which has only one method`
*  `getClass().getSimpleName()` in lambda returns name of class where lambda were written
	* `getClass().getSimpleName()` in anonymous class return empty name	
* if we want to reference variable outside anonymous class or lambda, we need declare variable as final
	* Time between creating runnable/anonymous  and using runnable/anonymous is quite much
	* References from a lambda expressions must be final or effectively final
* We don't need to use lambda expressions, we could achieve same with anonymous classes
	* To use them is up to person
* [Functional Programming](https://en.wikipedia.org/wiki/Functional_programming)
* [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)
* Name Consumer come "object in, nothing out", therefore consumes
* forEach is Consumer type runnable interface
	```
	
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
        
	```
* We can call method which lambda maps to, in case of `Predicate` it is `test`
	* Example of testing `ageCondition.test(employee)`
* We can chain predicates`System.out.println(greaterThan15.and(lessThan100).test(50));`
* Consumer does not return value
* Supplier does not accepts any values
* Predicates return only true or false
* Function interface, we can pass string and expect string to return
* One way to define Function
	```
	
	Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };
        
	```
	
	* Functions are useful. We can use them in parts which varies and in callbacks
	* We can chain Functions together with `andThen`