package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;
        {
            // long num = 1000; // powoduje błąd zmienna jest już zdefiniowana
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            // System.out.println("c: " + c); // powoduje błąd zmienna c za blokiem kodu
        }
        int c = 7;
        int a = 99; // nie ma konfliktu nazw bo jest za blokiem kodu

    }
}
