package it.dionis.challenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SevenBoomTest {

    @Test
    public void test_oneDigitNumbersWithSeven_PrintsBoom() {
	int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        assertEquals("Boom!", SevenBoom.sevenBoom(numbers));
    }
}
