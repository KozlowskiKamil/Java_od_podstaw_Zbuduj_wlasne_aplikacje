package com.example.basics.data.string_class;

public class StringsComparsion {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HEllo";

        if (s2.equals(s1)) System.out.println("s1 równe s2"); //true
        if (s3.equals(s1)) System.out.println("s3 równe s2"); //false
        if (s3.equalsIgnoreCase(s1)) System.out.println("s3 równe s2");//true

    }
}
