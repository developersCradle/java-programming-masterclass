package tutorial_30_floating_point_precision_and_challenge;

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;// Double are recommended to use, processed faster, libraries built using doubles
		System.out.println("MyIntValue= " + myIntValue);
		System.out.println("MyFloatValue= " + myFloatValue);
		System.out.println("MyDoubleValue= " + myDoubleValue);

		

		/* Challenge
		 * 
		 * Convert  given number of pounds to kilograms.
		 * 
		 * STEPS:
		 * 		1.Create a variable with the appropriate type to store the number of pounds to be
		 * 		converted to kilograms
		 *		2. Calculate the result i.e the number of kilograms based on the content of the
		 *		variable above and store the result in a 2nd appropriate variable.
		 *		3. Print out the result.
		 *
		 *  HINT: 1 pound is equals to 0.45359237 of kilogram. This should help you perform the calculation
		 */
		
		double pounds = 200.00D;
		double calculatedInKg =  pounds * 0.45359237d;  //Not for precise calculations, we need use BigDecimal
		System.out.println("Challange calculated in kg " + calculatedInKg);
		
		
	}
}
