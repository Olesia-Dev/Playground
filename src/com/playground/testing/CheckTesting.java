package com.playground.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckTesting {

    @Test
    public void stringComparison() {
        String stringToCompare = "Merry Christmas!";
        assertEquals("Merry Christmas!", stringToCompare);
    }

    @Test
    public void testSum() {
        Mathematics mathematics = new Mathematics();
        int result = mathematics.sumTwoNumbers(25, 31);

        assertEquals(56, result);
    }

    @Test
    public void testSumOfNegativeNumbers() {
        Mathematics mathematics = new Mathematics();
        int result = mathematics.sumTwoNumbers(-25, -31);

        assertEquals(-56, result);
    }

    @Test
    public void testSubtraction() {
        Mathematics mathematics = new Mathematics();
        int result = mathematics.subtractionTwoNumbers(31, 27);

        assertEquals(4, result);
    }

}
