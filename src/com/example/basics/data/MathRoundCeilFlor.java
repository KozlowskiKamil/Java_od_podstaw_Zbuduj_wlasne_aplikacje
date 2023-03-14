package com.example.basics.data;

public class MathRoundCeilFlor {
    public static void main(String[] args) {
        // Math.round zaokrąglenie do najbliższej liczby całkowitej
        System.out.println( Math.round(5.51) ); // 6
        System.out.println( Math.round(5.49) ); // 5

        // rzutowanie utrata części ułamkowej zostaje tylko całkowita
        System.out.println( (int) 5.51d ); // 5

        // Math.ceil > najiększa możliwa liczba całkowita
        System.out.println( Math.ceil(6.11) ); // 7.0
        System.out.println( Math.ceil(6.81) ); // 7.0

        // Math.flor < najmniejsza możliwa liczba całkowita
        System.out.println( Math.floor(6.11) ); // 7.0
        System.out.println( Math.floor(6.81) ); // 7.0
    }
}
