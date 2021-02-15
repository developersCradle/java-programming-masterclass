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
	* using class 
		*`` new Thread(new CodeToRun()).start(); ``
		
* Using lambda expressions `new Thread( () -> System.out.println("Printing from the Runnable!")).start();`
	* Lambda has three parts 
		* Argument list `()` in this case empty argument list
		* Arrow token `->`
		* Body code what we want to run, in this case `System.out.println("Printing from the Runnable!")`
* Compiler sees lambda expression ->  One of thread constructor accepts runnable parameter and it knows runnable interface has one method, which does not take any parameters -> Its able match lambda expressions argument list "no parameter" to run method 
	* Lambda needs to match to method -> lambda expressions can be used only with interfaces which contains only one method, which has to be implemented -> These interfaces are called functional interfaces