package com.example.basics.data.string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String[] args) {
        String str = "Jan Kowalski Kasia Kowalska";
        String str1 = str.replaceAll("Kowalska", "Nowacka");
        System.out.println("str1 = " + str1);
        String str2 = str1.replaceFirst(" ", " Junior ");
        System.out.println("str2 = " + str2);



    }
}
