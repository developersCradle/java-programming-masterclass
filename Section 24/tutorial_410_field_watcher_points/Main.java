package tutorial_410_field_watcher_points;

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
