package com.playground.collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class PlayWithLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 18));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

        Queue<PlayWithQueue.Person> supermarket = new LinkedList<>();
        supermarket.add(new PlayWithQueue.Person("Alex", 21));
        supermarket.add(new PlayWithQueue.Person("Mariam", 18));
        supermarket.add(new PlayWithQueue.Person("Ali", 40));
        supermarket.add(new PlayWithQueue.Person("Alexa", 35));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {
    }

}
