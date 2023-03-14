package com.playground.streams;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

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

////        6. Average of squares of an int array
//        Arrays.stream(new int[]{2, 4, 6, 8, 10, 12, 14})
//                .map(x -> x * x)
//                .average()
//                .ifPresent(System.out::println);

//        7. Stream from List, filter and print
//        List<String> people = Arrays.asList("Olesia", "Oleksandr", "Oliver", "Anna", "Iryna", "lina");
//        people
//                .stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("l"))
//                .forEach(System.out::println);

//        8. Stream rows from text file, sort, filter, and print
//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        bands
//                .sorted()
//                .filter(x -> x.length() > 13)
//                .forEach(System.out::println);
//        bands.close();

////        9. Stream rows from text file and save to List
//        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
//                .filter(x -> x.contains("jit"))
//                .collect(Collectors.toList());
//        bands2.forEach(x -> System.out.println(x));

//        10. Reduction - sum
//        double total = Stream.of(7.3, 1.8, 4.5)
//                .reduce(0.0, (Double a, Double b) -> a + b);
//        System.out.println("Total = " + total);

//        11. Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }

}
