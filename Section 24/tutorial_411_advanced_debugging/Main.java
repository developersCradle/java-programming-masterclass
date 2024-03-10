package tutorial_411_advanced_debugging;

public class Main {

	public static void main(String[] args) {
		StrigUtilities utils = new StrigUtilities();
		
		StringBuilder sb = new StringBuilder();
		
		while (sb.length() < 10) {
			utils.addchar(sb, 'a');
		}
		
		System.out.println(sb);
		
		String str = "abcdefg";
		String result = utils.upperAndPrerix(utils.addSuffic(str));
		
		
	}

}
