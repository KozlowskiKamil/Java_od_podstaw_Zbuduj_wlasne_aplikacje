package com.example.basics.data.string_class;

public class Function_IndexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery";
        int index = str.indexOf("dwa trzy");
        System.out.println("index = " + index);

        index = str.indexOf("pięć");
        System.out.println("index = " + index);

        index = str.indexOf("trzy", 10);
        System.out.println("index = " + index);
    }
}