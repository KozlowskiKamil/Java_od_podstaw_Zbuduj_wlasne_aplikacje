package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("23456789876544567");
        bigInt = bigInt.add(new BigInteger("234567890987654345678"));
        System.out.println("Wynik " + bigInt);
        BigDecimal decimal = new BigDecimal("1564324322.17654322345672");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("3245678.7654321"));
        System.out.println("Wynik: " + decimal.toString());
    }
}
