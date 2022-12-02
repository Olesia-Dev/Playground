package com.playground.string;

public class StringReverse {

    public static void main(String[] args) {
        String originalStr = "Olesia";

        reverseStringBuilding(originalStr);
        reverseStringIteration(originalStr);
    }

    private static void reverseStringBuilding(String stringToReverse) {
        String reversedStr = "";

        for (int i = 0; i < stringToReverse.length(); i++) {
            reversedStr = stringToReverse.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }

    private static void reverseStringIteration(String stringToReverse) {
        String reversedStr = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedStr += stringToReverse.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);
    }

}
