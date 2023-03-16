package com.example.basics.control_flow_statements;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 8;
        int b = (a > 3) ? 100 : 9;
        System.out.println("b " + b);

        //to samo co if else
        if (a > b) {
            b = 100;
        } else b = 9;
        System.out.println("b " + b);

    }
}
