package coding_exercises_15;

/*
	Example Input/Output
	isPalindrome(-1221);-> should return true
	isPalindrome(707);-> should return true 
	isPalindrome(11212);-> should return false because reverse is 21211 and that is not equal to 11212.
*/
public class Main {
	public static void main(String[] args) {
		System.out.println(NumberPalindrome.isPalindrome(-1221));
		System.out.println(NumberPalindrome.isPalindrome(707));
		System.out.println(NumberPalindrome.isPalindrome(11212));
	}
}
