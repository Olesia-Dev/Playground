package com.playground.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Please enter your expression:");
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine();

        Pattern expressionPattern = Pattern.compile("^(\\d+)\\s*([+*-/])\\s*(\\d+)$");
        Matcher expressionMatcher = expressionPattern.matcher(inputExpression);
        if (expressionMatcher.find()) {
            double firstNumber = Double.parseDouble(expressionMatcher.group(1));
            double secondNumber = Double.parseDouble(expressionMatcher.group(3));
            calculate(firstNumber, secondNumber, expressionMatcher.group(2));
        } else {
            System.out.println("Your input is not recognized as simple mathematical expression!");
        }
    }

    private static void calculate(double firstNumber, double secondNumber, String operation) {
        Double result = null;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by zero is not allowed!");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }
        System.out.println("The result is: " + result);
    }

}
