package tutorial_62_Equality_Printer;


public class Main {
/*
 * * printEqual(1, 1, 1); should print text All numbers are equal

* printEqual(1, 1, 2); should print text Neither all are equal or different

* printEqual(-1, -1, -1); should print text Invalid Value

* printEqual(1, 2, 3); should print text All numbers are different
 */
	public static void main(String[] args) {
	  
		IntEqualityPrinter.printEqual(1, 1, 1);
		IntEqualityPrinter.printEqual(1, 1, 2);
		IntEqualityPrinter.printEqual(-1, -1, -1);
		IntEqualityPrinter.printEqual(1, 2, 3);
	  
  }
}
