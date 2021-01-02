package tutorial_28_primitive_types_challenge;


public class Main {

    public static void main(String[] args) {

    	/*
    	 * Challenge
    	 * 
    	 * Create byte variable and set set it to any valid byte number, it doesn't matter. 
    	 * Create a short variable and set it to any valid short number.
    	 * 
    	 * Create an int variable and set it to any valid int number. Lastly, create a variable of type
    	 * long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values
    	 */
       
    	
    	byte myByteVar = 111;
    	short myShortVar = 22222;
    	int myIntVar = 333333;
    	long myLongVar = 50000L + (10L * (myByteVar+myShortVar+myIntVar));
    	
    	
    	System.out.println("My last long value " + myLongVar);
    	
    	
    }
}
