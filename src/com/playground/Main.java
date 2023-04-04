package com.playground;

import com.playground.variables.InstanceExample;

public class Main {

    public static void main(String[] args) {
        InstanceExample name = new InstanceExample();
        System.out.println("Student name is: " + name.student);
        System.out.println("Default value for int is: " + name.i);
        System.out.println("Default value for Integer is: " + name.I);
    }

}
