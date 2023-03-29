package com.example.basics.data.string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String[] args) {
        String str = "Ola ma kota";

        char arr[] = str.toCharArray();
        System.out.println("arr = " + arr.length);

        String strArr[] = str.split(" ");
        System.out.println("strArr = " + strArr[0]);
        System.out.println("strArr = " + strArr[1]);
        System.out.println("strArr = " + strArr[2]);

        String s = str.toString();
        System.out.println("s = " + s);

        System.out.println("strArr = " + strArr.toString());

        Integer i = new Integer(123);
        System.out.println("i = " + i.toString());

        String text = "Liczba: " + i;
        System.out.println("text = " + text);

    }
}
