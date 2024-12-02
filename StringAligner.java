
public interface StringAligner {

	/**
	 * Centers a string within a given width.
	 * @param text The string to be centered.
	 * @param totalWidth The total width of the string including padding.
	 * @return The centered string.
	 */
	public static String centerString(String text, int totalWidth) {
		// If the text is longer than the total width, return the original text
		if (text.length() >= totalWidth) {
			return text;
		}

		// Calculate the padding on both sides
		int padding = (totalWidth - text.length()) / 2;

		// Create the formatted string with padding on both sides
		String centeredText = String.format("%" + (padding + text.length()) + "s", text);
		centeredText = String.format("%-" + totalWidth + "s", centeredText);

		
		while (centeredText.length() != totalWidth) {
			centeredText += " ";
		}
		
		return centeredText;
	}
}
