package com.example.lambda;

@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    default int subtract(int a, int b) {
        return a - b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

class MathClass implements MathInterface {
    @Override
    public int multiply(int a, int b) {
        System.out.println("MathClass.multiply()");
        return MathInterface.super.multiply(a, b);
    }

    @Override
    public int operate(int a, int b) {
        System.out.println("MathClass.operate()");
        return a + b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("MathClass.add()");
        return MathInterface.super.add(a, b);
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        MathInterface math = (int a, int b) -> a * b;
        System.out.println("math = " + math.operate(10, 30));
        MathInterface.divide(10, 2);
        System.out.println("math = " + MathInterface.divide(100, 4));
        System.out.println("math = " + math.add(100, 5));

        MathClass mathClass = new MathClass();
        System.out.println("mathClass = " + mathClass.operate(50, 51));
        System.out.println("mathClass = " + mathClass.multiply(4, 4));
        System.out.println("mathClass = " + mathClass.subtract(100, 30));
        System.out.println("mathClass = " + mathClass.add(22, 3));

    }
}
