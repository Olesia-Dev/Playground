package com.playground.statements;

public class Continue {

    public static void main(String[] args) {
//      Example 1
//        for (int i = 0; i <= 15; i++) {
//            if (i == 10 || i == 12){
//                continue;
//            }
//            System.out.println(i + " ");
//        }
//
//        Example 2
        int count = 20;
        while (count >= 0) {
            if (count == 7 || count == 15) {
                count--;
                continue;
            }
            System.out.print(count + " ");
            count--;
        }
    }
}
