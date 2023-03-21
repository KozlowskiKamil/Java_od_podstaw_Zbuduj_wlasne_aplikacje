package com.example.basics.data.string_class;

public class Length_toLowerCase_toUpperCase_chartAt {
    public static void main(String[] args) {
        String str = "Ola ma kota";
        System.out.println("Ilość znaków: " + str.length());
        char sign = str.charAt(1);
        System.out.println("Znak pod indexem 1 " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);

    }
}
