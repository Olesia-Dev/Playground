package com.playground.statements;

public class Break {

    public static void main(String[] args) {
        int drink = 1;
        switch (drink) {
            case 1:
                System.out.println("I like late!");
                break;
            case 2:
                System.out.println("Tea it's not my choice!");
                break;
            default:
                System.out.println("Water is the best drink!");
        }
    }

}
