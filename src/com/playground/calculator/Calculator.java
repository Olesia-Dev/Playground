package com.playground.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    static final Pattern MATH_EXPRESSION_PATTERN = Pattern.compile(
            "^(\\d+[.]?\\d*)\\s*([+*-/])\\s*(\\d+[.]?\\d*)$");

    public static void main(String[] args) {
        System.out.println("Please enter your expression:");
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine();

        Matcher expressionMatcher = MATH_EXPRESSION_PATTERN.matcher(inputExpression);
        if (expressionMatcher.find()) {
            double firstNumber = Double.parseDouble(expressionMatcher.group(1));
            double secondNumber = Double.parseDouble(expressionMatcher.group(3));
            Calculator calculator = new Calculator();
            Double result = calculator.calculate(firstNumber, secondNumber, expressionMatcher.group(2));
            if (result != null) {
                System.out.println("The result is: " + result);
            }
        } else {
            System.out.println("Your input is not recognized as simple mathematical expression!");
        }
    }

    Double calculate(double firstNumber, double secondNumber, String operation) {
        Double result = null;
        switch (operation) {
            case "+" -> result = sum(firstNumber, secondNumber);
            case "-" -> result = subtract(firstNumber, secondNumber);
            case "*" -> result = multiply(firstNumber, secondNumber);
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Division by zero is not allowed!");
                    return result;
                }
                result = divide(firstNumber, secondNumber);
            }
        }
        return result;
    }

    double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

}
