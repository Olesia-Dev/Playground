package com.playground.calculator;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        Double result = calculator.calculate(5, 0, "/");
        assertNull(result);
    }

    @Test
    public void testMathExpression() {
        String expression = "2 + 3";
        Matcher matcher = Calculator.MATH_EXPRESSION_PATTERN.matcher(expression);
        assertTrue(matcher.find());
    }

    @Test
    public void testUnsupportedMathExpression() {
        String expression = "2 % 3";
        Matcher matcher = Calculator.MATH_EXPRESSION_PATTERN.matcher(expression);
        assertFalse(matcher.find());
    }

}
