package com.example.basics.data.string_class;

public class BlanckStringAndNull {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.length());
        s1 = s1.concat("Hello world");
        System.out.println(s1);


        String s2 = null;
        s2 = "testt";   // musi być przypisana wartość aby były metody
        System.out.println(s2.length());

    }
}
