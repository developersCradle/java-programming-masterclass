package coding_exercises_7;

/*
* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19




* isTeen(9);  should return false since 9 is in not range 13 - 19

* isTeen(13);  should return true since 13 is in range 13 - 19

*/
public class Main {

	public static void main(String[] args) {
		TeenNumberChecker.hasTeen(9, 99, 19);
		TeenNumberChecker.hasTeen(23, 15, 42);
		TeenNumberChecker.hasTeen(22, 23, 34);

		TeenNumberChecker.isTeen(9);
		TeenNumberChecker.isTeen(13);

	}

}
