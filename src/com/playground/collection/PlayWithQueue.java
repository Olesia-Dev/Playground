package com.playground.collection;

import java.util.LinkedList;
import java.util.Queue;

public class PlayWithQueue {

    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));
        supermarket.add(new Person("Alexa", 35));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {
    }

}
