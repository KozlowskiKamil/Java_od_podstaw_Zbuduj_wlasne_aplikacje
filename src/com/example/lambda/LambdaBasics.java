package com.example.lambda;

// interfejs funkcyjny
interface Addition {
    int add(int a, int b);
}

// interfejs funkcyjny
interface MathOperation<T> {
    T operate(T a, T b);
}

public class LambdaBasics {
    public void test(Addition addition) {
        System.out.println("addition = " + addition.add(100, 50));
    }

    public static void main(String[] args) {
        Addition addition = (int a, int b) -> a + b;
        System.out.println("addition = " + addition.add(4, 4));
        System.out.println("addition = " + addition.add(3, 3));
        System.out.println("addition = " + addition.add(10, 5));
        System.out.println("addition = " + addition.add(10, 11));

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test(addition);

        lambdaBasics.test((a, b) -> a * 2 + b);

        MathOperation<Float> addition2 = (a, b) -> a + b;
        System.out.println("addition2 = " + addition2.operate(10.5f, 6f));

        MathOperation<Integer> substraction = (a, b) -> a - b;
        System.out.println("substraction = " + substraction.operate(10, 3));
    }
}
