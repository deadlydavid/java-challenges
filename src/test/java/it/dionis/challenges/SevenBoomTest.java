package it.dionis.challenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SevenBoomTest {

    private static String BOOM = "Boom!";
    private static String NO_BOOM = "there is no 7 in the array";

    @Test
    public void test_oneDigitNumbersWithSeven_PrintsBoom() {
        assertEquals(BOOM, SevenBoom.sevenBoom(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
    }

    @Test
    public void test_digitNumbersWithoutSeven_PrintsNone() {
	assertEquals(NO_BOOM, SevenBoom.sevenBoom(new int[] { 8, 6, 33, 100 }));
    }

    @Test
    public void test_digitNumbersWithSevenInTwoDigitNumber_PrintsBoom() {
	assertEquals(BOOM, SevenBoom.sevenBoom(new int[] { 2, 55, 60, 97, 86 }));
    }

}
