package coding_exercises_5;

/*
 areEqualByThreeDecimalPlaces(-3.1756, -3.175); true
 areEqualByThreeDecimalPlaces(3.175, 3.176); false 
 areEqualByThreeDecimalPlaces(3.0, 3.0);  true
 areEqualByThreeDecimalPlaces(-3.123, 3.123); false

 */
public class Main {

	public static void main(String[] args) {

		DecimalCompartor.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		DecimalCompartor.areEqualByThreeDecimalPlaces(3.175, 3.176);
		DecimalCompartor.areEqualByThreeDecimalPlaces(3.0, 3.0);
		DecimalCompartor.areEqualByThreeDecimalPlaces(-3.123, 3.123);
	}

}
