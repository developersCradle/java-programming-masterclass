package tutorial_409_more_debugging;

public class StrigUtilities {

		private StringBuilder sBuilder = new StringBuilder();
		private int charAdded = 0;
		
		public void addchar(StringBuilder sBuilder, char c) {
			this.sBuilder.append(c); // Bug here
			charAdded++;
		}
}
