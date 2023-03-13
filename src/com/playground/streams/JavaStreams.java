package com.playground.streams;

import java.io.IOException;
import java.util.Arrays;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
//        1. Integer Streams
//        IntStream
//                .range(1, 10)
//                .forEach(System.out::println);
//        System.out.println();

//        2. Integer Stream with Skip
//        IntStream
//                .range(1, 10)
//                .skip(5)
//                .forEach(x -> System.out.println(x));
//        System.out.println();

//        3. Integer Stream with Sum
//        System.out.println(
//                IntStream
//                        .range(1, 5)
//                        .sum());
//        System.out.println();

//        4. Streams.of, sorted and findFirst
//        Stream.of("Olesia", "Alex", "Marharyta")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println);

//        5. Stream from Array, sort, filter and print
//        String[] names = {"Olesia", "Olia", "Alex", "Orysia", "Iryna", "Jack", "Emma"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("O"))
//                .sorted()
//                .forEach(System.out::println);

//        6. Average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10, 12, 14})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }

}
