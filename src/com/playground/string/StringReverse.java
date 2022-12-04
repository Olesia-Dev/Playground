package com.playground.string;

import java.util.Arrays;
import java.util.Collection;

public class StringReverse {

    public static void main(String[] args) {
        String originalStr = "Merry Christmas!";

        reverseStringBuilding(originalStr);
        reverseStringIteration(originalStr);
        reverseByStringBuilder(originalStr);
        reverseUsingSwap(originalStr);

        String recursionReverse = reverseUsingRecursion(originalStr, originalStr.length() - 1);
        System.out.println("reverseUsingRecursion:" + recursionReverse);
    }

    private static void reverseStringBuilding(String stringToReverse) {
        String reversedStr = "";

        for (int i = 0; i < stringToReverse.length(); i++) {
            reversedStr = stringToReverse.charAt(i) + reversedStr;
        }

        System.out.println("reverseStringBuilding: " + reversedStr);
    }

    private static void reverseStringIteration(String stringToReverse) {
        String reversedStr = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedStr += stringToReverse.charAt(i);
        }

        System.out.println("reverseStringIteration: " + reversedStr);
    }

    private static void reverseByStringBuilder(String stringToReverse) {
        String reversed = new StringBuilder(stringToReverse).reverse().toString();
        System.out.println("reverseByStringBuilder: " + reversed);
    }

    private static void reverseUsingSwap(String stringToReverse) {
        char[] array = stringToReverse.toCharArray();
        int begin = 0;
        int end = array.length - 1;
        char tmp;
        while (end > begin) {
            tmp = array[begin];
            array[begin] = array[end];
            array[end] = tmp;
            begin++;
            end--;
        }
        System.out.println("reverseUsingSwap: " + new String(array));
    }

    private static String reverseUsingRecursion(String stringToReverse, int lastIndex) {
        if (lastIndex == 0) {
            return stringToReverse.charAt(0) + "";
        }
        char letter = stringToReverse.charAt(lastIndex);
        return letter + reverseUsingRecursion(stringToReverse, lastIndex - 1);
    }

}
