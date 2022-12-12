package com.playground.loop;

import java.util.*;

public class LoopPlayer {

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println();
        printTriangleBackwards(5);
        iterateCollection(List.of(1, 2, 3, 4, 5));
        iterateStringCollection(Set.of("dog", "cat", "bunny", "mouse"));
        playWithWhileLoop();
    }

    private static void printTriangle(int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTriangleBackwards(int dimension) {
        int innerDimension = dimension;
        for (int i = 0; i < dimension; i++, innerDimension--) {
            for (int j = 0; j < innerDimension; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void iterateCollection(Collection<Integer> collection) {
        for (Integer elementOfCollection : collection) {
            System.out.println(elementOfCollection);
        }
    }

    private static void iterateStringCollection(Set<String> stringSet) {
        for (String elementOfStringSet : stringSet) {
            System.out.println(elementOfStringSet);
        }
    }

    private static void playWithWhileLoop() {
        List<String> stringList = new ArrayList<>(List.of("Olesia", "Alex", "Ivan", "Iryna"));
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
