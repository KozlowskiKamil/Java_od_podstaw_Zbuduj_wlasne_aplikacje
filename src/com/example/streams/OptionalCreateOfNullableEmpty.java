package com.example.streams;

import java.util.Optional;

public class OptionalCreateOfNullableEmpty {
    public static void main(String[] args) {
        // Optional.of() tworzy optional który nie może być null

        Optional<String> opt1 = Optional.of("test");
        System.out.println("opt1 = " + opt1.get());

        //    Optional<String> opt2 = Optional.of(null); wyrzuci błąd nie może być null

        Optional<String> opt3 = Optional.ofNullable("optional3");
        System.out.println("opt3 = " + opt3.get()); // optional 3

        Optional<String> opt4 = Optional.ofNullable(null);
        System.out.println("opt4 = " + opt4); // optional empty

        Optional<String> opt5 = Optional.empty();
        System.out.println("opt5 = " + opt5); // optional empty

        Integer integer = Integer.valueOf(10);
      //  integer = null;
        Optional<Integer> optInt = Optional.ofNullable(integer);
        if (optInt.isPresent()) {
            System.out.println("optInt = " + optInt.get());
        } else System.out.println(" empty ");

        optInt.ifPresent(i -> System.out.println("i = " + i));
        optInt.ifPresent(System.out::println);
    }

}
