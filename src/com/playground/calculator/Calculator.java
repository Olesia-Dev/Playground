package com.playground.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Please enter your expression:");
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine();

        String[] array = inputExpression.split("\\s");
        double firstNumber = Double.parseDouble(array[0]);
        double secondNumber = Double.parseDouble(array[2]);
        calculate(firstNumber, secondNumber, array[1]);
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
