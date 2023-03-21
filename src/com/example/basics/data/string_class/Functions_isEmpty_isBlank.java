package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {
        String emptyStr = "";
        String blanckStr = "   \n       ";

        if (emptyStr.isEmpty()) {
            //true
            System.out.println("emptyStr jest pusty - isEmpty");
        }

        if (blanckStr.isEmpty()) {
            //false
            System.out.println("blanckStr jest pusty - isEmpty");
        } else {
            System.out.println("blanckStr nie jest pusty - isEmpty");
        }

        if (blanckStr.isBlank() ){
            //true
            System.out.println("blanckStr 0 znaków lub same białe znaki");
        }
        if (emptyStr.isBlank()){
            System.out.println("emptyStr 0 znaków lub same białe znaki");
        }


    }
}
