package com.playground.converter;

import java.util.Scanner;

public class ConvertFahrenheitToCelsiusUsingStaticMethod {

    public static void main(String[] args) {
        double a, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit to Celsius");
        a = scanner.nextDouble();
        System.out.println("Celsius temperature is = " + celsius(a));
    }

    static double celsius (double f) {
        return (f-32)*5/9;
    }

}
