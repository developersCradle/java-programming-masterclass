package tutorial_25_primitive_types;


public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;// To figure out min value
        int myMaxIntValue = Integer.MAX_VALUE;// To figure out max value
        System.out.println("Integer Minimum Value = " + myMinIntValue); 
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow

        int myMaxIntTest = 2_147_483_647;
    }
}
