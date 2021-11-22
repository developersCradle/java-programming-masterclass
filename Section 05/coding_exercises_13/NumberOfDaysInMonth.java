package coding_exercises_13;

/*
Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.



NOTE:The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  Both of type int.

If parameter month is < 1 or > 12 return -1. 
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:




HINT: Use the switch statement.

NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

NOTE: Do not add a main method to solution code.
 */

public class NumberOfDaysInMonth {

	public static boolean isLeapYear(int year) {

		if ((year < 1) || (year >= 9999)) {
			return false;
		} else
			return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {

		if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
			return -1;
		}
		if (isLeapYear(year) && month == 2) {
			return 29;
		}

		switch (month) {
		case 11:
		case 4:
		case 6:
		case 9:
			return 30;
		case 2:
			return 28;
		default:
			return 31;
		}

	}

}
