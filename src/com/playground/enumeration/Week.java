package com.playground.enumeration;

public class Week {

    public static void main(String[] args) {
        String monday = "MONDAY";
        Test firstTest = new Test(Day.valueOf(monday));
        firstTest.dayIsLike();

        String sunday = "SUNDAY";
        Test secondTest = new Test(Day.valueOf(sunday));
        secondTest.dayIsLike();
    }

}
