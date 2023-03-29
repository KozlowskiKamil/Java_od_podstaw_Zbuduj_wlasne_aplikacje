package com.example.basics.data.string_class;

public class Function_lastIndexOf {
    public static void main(String[] args) {
        String str = "Raz dwa trzy cztery. Raz dwa";

        int index = str.lastIndexOf("Raz");
        System.out.println("Ostatnie wystąpienie Raz = " + index);

        String feagment = str.substring(index);
        System.out.println("feagment = " + feagment);

        index = str.indexOf("Raz");
        System.out.println("Pierwsze wystąpienie Raz = " + index);

    }
}
