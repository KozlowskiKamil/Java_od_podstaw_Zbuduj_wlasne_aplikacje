package com.example.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArraListExample {
    public static void main(String[] args) {
        //  ArrayList<String> arr = new ArrayList<>();

        ArrayList<String> arr = new ArrayList<>();
        arr.add("bmw");
        arr.add("merc");
        arr.add(null);
        arr.add("vw");
        arr.add("pontiak");
        arr.add(null);
        System.out.println("arr = " + arr);


        arr.removeIf(a -> a == null || a.equalsIgnoreCase("merc"));
        System.out.println("arr = " + arr);
    }
}
