package com.example.basics.data;

public class NumbersConversion {
    public static void main(String[] args) {
        // konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d / (double) i;
        System.out.println(d);

        // konwersja niejawna - rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        //rzutowanie = casting
        double d2 = 5.5;
        int num = 10 * (int) d2;    // przy konwersji float/ double na
                                    // typ całkowity np int część ułamkowa
                                    //jest tracona zostaje całkowita liczba bez ułamku.
        System.out.println(num); // wynik 50 zamiast 55

        byte small = (byte)200;  // rzutowanie z short na byte co powoduje utratę informacji
        System.out.println("small: " + small);


    }
}
