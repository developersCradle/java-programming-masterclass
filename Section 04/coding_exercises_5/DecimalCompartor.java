package coding_exercises_5;

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175);-> should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); -> should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); -> should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); -> should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.

 */
public class DecimalCompartor {

	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

		a = a * 1000;

		b = b * 1000;

		int a1 = (int) a;

		int b1 = (int) b;

		if (a1 == b1) {
			System.out.println("it works");
			return true;
		}

		else
			System.out.println("it doesn't work");
		return false;

	}
}
