package com.playground.abstraction;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " meows");
    }

}
