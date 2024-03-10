package tutorial_412_introduction_to_unit_testing_with_junit;

public class StrigUtilities {

		private StringBuilder sBuilder = new StringBuilder();
		private int charAdded = 0;
		
		public void addchar(StringBuilder sBuilder, char c) {
			this.sBuilder.append(c); // Bug here
			charAdded++;
		}
}
