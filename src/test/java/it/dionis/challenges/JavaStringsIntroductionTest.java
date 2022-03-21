package it.dionis.challenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JavaStringsIntroductionTest {

	@Test
	public void test_anEmptyString_hasLengthZero() {
		int result = JavaStringsIntroduction.getLengthOf("");
		assertEquals(0, result);
	}

	@Test
	public void test_null_hasLengthZero() {
		int result = JavaStringsIntroduction.getLengthOf(null);
		assertEquals(0, result);
	}

	@Test
	public void test_simpleString_printsCorrectLength() {
		int result = JavaStringsIntroduction.getLengthOf("coffee");
		assertEquals(6, result);
	}

	@Test
	public void test_firstIsLexiLarger_givesTrue() {
		assertEquals(true, JavaStringsIntroduction.isFirstLexiLarger("Rex", "Abc"));
	}
	
        @Test
	public void test_firstIsLexiSmaller_givesFalse() {
		assertEquals(false, JavaStringsIntroduction.isFirstLexiLarger("Abc", "Rex"));
	}
}