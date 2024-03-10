package tutorial_411_advanced_debugging;

public class StrigUtilities {

	private StringBuilder sBuilder = new StringBuilder();
	private int charAdded = 0;

	public void addchar(StringBuilder sBuilder, char c) {
		sBuilder.append(c); // Bug here
		charAdded++;
	}

	public String upperAndPrerix(String str) {

		String upper = str.toUpperCase();
		return "Prefix_" + upper;
	}

	public String addSuffic(String str) {

		return str + "_Suffix";

	}
}
