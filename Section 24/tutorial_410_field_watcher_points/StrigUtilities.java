package tutorial_410_field_watcher_points;

public class StrigUtilities {

		private StringBuilder sBuilder = new StringBuilder();
		private int charAdded = 0;
		
		public void addchar(StringBuilder sBuilder, char c) {
			sBuilder.append(c); // Bug here
			charAdded++;
		}
}
