package com.example.basics.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {
        String stt = "Info";
        stt = stt.repeat(4);
        System.out.println("stt = " + stt);

        String joinedText = String.join(" - ", "Raz", "Dwa", "Trzy");
        System.out.println("joinedText = " + joinedText);

        String text = "Ola ".concat("ma") + " kota".concat(".");
        System.out.println("text = " + text);
    }
}
