package tutorial_412_introduction_to_unit_testing_with_junit;

public class Main {

	public static void main(String[] args) {
		StrigUtilities utils = new StrigUtilities();
		
		StringBuilder sb = new StringBuilder();
		
		while (sb.length() < 10) {
			utils.addchar(sb, 'a');
		}
		
		System.out.println(sb);
	}

}
