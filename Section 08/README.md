# Section 8: Arrays, Java inbuilt Lists, Autoboxing and Unboxing

Arrays, Java inbuilt Lists, Autoboxing and Unboxing

# What I Learned
* Arrays stores sequence of values
* Creating copy of old array and initializing to same size
	* `Arrays.copyOf` copies arrays
* `scanner.nextInt()` reads int input
* String is references type
* `new` operator return reference
* `Arrays.toString` converts array to string
* LinkedList allows your create and delete elements without need to create full list
* Resizing with arrays is to create new array and copy content to new array
* List is a interface
	* Thought this interface you manipulate list
* ArrayList
	* Handles resizing automatically
	* `ArrayList<String>` ArrayList holds objects of Strings
		* Arraylist is a class
* `.contains` is doing fast search for us
* Tutorial 107 practical implementation of arraylist using encapsulation
* `ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());`
	* Copying arraylist at declaration level
* `Integer.valueOf()` gets value of integer
* LinkedList Allocates 4 bytes for each integer
	* With double this would be 8 bytes
	* With Strings 8 bytes, but this time its pointer to another place
* ArrayList is slow when adding element into middle
	* This can be solved by linkedList
		* Every element has link to another
		
<img src="file://linkedList.png" alt="alt text" width="200"/>