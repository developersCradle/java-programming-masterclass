package tutorial_306_regular_expressions;

public class Main {

	
	public static void main(String[] args) {
		String string = "I am a string. Yes, I am";
		System.out.println(string);
		String yourString = string.replaceAll("I", "You");
		System.out.println(yourString);
		
		
		String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
		System.out.println(alphanumeric.replaceAll(".","Y"));
		
		
		System.out.println(alphanumeric.replaceAll("^abcDeee",  "YYY"));
		
		String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
		System.out.println(secondString.replaceAll("^abcDeee",  "YYY"));
		
		System.out.println(alphanumeric.matches("^hello"));
		System.out.println(alphanumeric.matches("^abcDeee"));//false whole string need to be matched
		System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));//Whole string needed to match when using matches
		System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));//Whole string needed to match when using matches
		
		System.out.println(alphanumeric.replaceAll("ijkl99z$",  "THE END"));
		System.out.println(alphanumeric.replaceAll("[aei]",  "X"));
		System.out.println(alphanumeric.replaceAll("[aei]",  "I replaced a letter here"));
		
		System.out.println(alphanumeric.replaceAll("[aei][Fj]",  "X"));
		
	} 
}
