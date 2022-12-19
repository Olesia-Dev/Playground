package com.playground.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        double result = calculator.sum(2.2, 4.3);
        assertEquals(6.5, result);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(6.5, 4);
        assertEquals(2.5, result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

}
