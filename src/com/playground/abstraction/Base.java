package com.playground.abstraction;

public class Base {

    public static void main(String[] args) {
        Star star = new Employee("Alex", "Java Developer", 34, 15000.5F);
        star.printFromAbstractParent();
        star.printInfo();
    }

}
