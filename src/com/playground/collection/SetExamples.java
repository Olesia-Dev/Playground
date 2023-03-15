package com.playground.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
//        Set<String> set = Set.of("Hello", "World", "1", "2", "3");

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        set.add("1");
        set.add("2");
        set.add("3");
        
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
