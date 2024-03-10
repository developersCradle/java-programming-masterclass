package tutorial_408_debugging;

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
