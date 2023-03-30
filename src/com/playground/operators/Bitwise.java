package com.playground.operators;

public class Bitwise {

    public static void main(String[] args) {
        int a = 6;
        int b = 31;
        System.out.println("a&b = " + (a & b));
        System.out.println("a|b = " + (a | b));
        System.out.println("a^b = " + (a ^ b));
        System.out.println("~a = " + ~a);

        a &= b;
        System.out.println("a= " + a);
    }

}
