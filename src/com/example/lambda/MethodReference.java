package com.example.lambda;

import java.util.function.IntSupplier;

public class MethodReference {

    public void tett(IntSupplier intSupplier) {
        System.out.println("intSupplier = " + intSupplier.getAsInt());
    }

    public static void main(String[] args) {
        Object obj = new Object();
        IntSupplier intSupplier = obj::hashCode;

        System.out.println("intSupplier = " + intSupplier.getAsInt());

        MethodReference methodReference = new MethodReference();
        methodReference.tett(intSupplier);
    }
}
