package com.example.oop.basic.methods;

class Triangle {
    float a;
    float h;
    float surfaceArea;

    Triangle(float base, float heigh) {
        a = base;
        h = heigh;
    }

    public float getSurfaceArea(float a, float h) {
        surfaceArea = a * h / 2f;
        return surfaceArea;
    }
}

class MyMath {
    public void add(int a, int b) {
        a = 20;
        int result = a + b;
        System.out.println("result = " + result);
    }
}

public class InvokingMethods {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int a = 10;
        int b = 7;
        myMath.add(a, b);
        System.out.println("a = " + a);

        Triangle triangle = new Triangle(10, 5);
        System.out.println("triangle = " + triangle.getSurfaceArea(10, 5));

    }
}