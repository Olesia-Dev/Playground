package com.playground.enumeration;

public class Test {

    Day day;

    public Test(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY -> System.out.println("It's a first working day!");
            case FRIDAY -> System.out.println("It's a last working day!");
            case SATURDAY, SUNDAY -> System.out.println("The best weekend ever!");
            default -> System.out.println("Time for meetings!");
        }
    }

}
