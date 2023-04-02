package com.example.streams;

import java.util.stream.Stream;

public class IterateCreateStreams {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);

        Stream.iterate(1, n -> n + 1).limit(10).forEach(s -> System.out.println("s = " + s));

        System.out.println("\n");

        Stream.iterate(0, n -> n < 6, n -> n + 1).forEach(s -> System.out.println("s = " + s));
    }
}
