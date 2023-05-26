package com.playground.abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " barks");
    }

}
