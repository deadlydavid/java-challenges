package it.dionis.challenges;

public class JavaStringsIntroduction {

	public static void main(String... args) {
		System.out.println("Hello, world!");
	}

	public static int getLengthOf(String inputString) {
		return (inputString == null) ? 0
			                     : inputString.length();
	}

	public static boolean isFirstLexiLarger(String first, String second) {
		if (first == null) return false;
		if (second == null) return true;
		return (first.compareTo(second) > 0) ? true : false;
	}

	public static String capitalize(String input) {
		Character firstChar = input.charAt(0);
		String result = Character.toUpperCase(firstChar) + input.substring(1);
		return result;
	}
}
