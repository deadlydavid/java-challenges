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
		return true;
	}
}