package coding_exercises_6;

/*

* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

*/
public class Main {

	public static void main(String[] args) {
		EqualSumChecker.hasEqualSum(1, 1, 1);
		EqualSumChecker.hasEqualSum(1, 1, 2);
		EqualSumChecker.hasEqualSum(1, -1, 0);
	}

}
