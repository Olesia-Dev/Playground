package com.playground.abstraction;

class Employee extends Star {

    String name;
    String position;
    int age;
    float salary;

    Employee(String name, String position, int age, float salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    void printInfo() {
        System.out.println("Employee " + this.name + " has next parameters: " + this);
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "]";
    }

}
