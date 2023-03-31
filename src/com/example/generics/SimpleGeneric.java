package com.example.generics;

class Point<T> {
    private T x;
    private T t;

    public Point(T x, T t) {
        this.x = x;
        this.t = t;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", t=" + t +
                '}';
    }
}

class Trio<T, U, V> {
    private T first;
    private U second;
    private V third;

    @Override
    public String toString() {
        return "Trio{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    public Trio(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

public class SimpleGeneric {
    public static void main(String[] args) {
        Point<Integer> pointInt = new Point<>(12, 30);
        System.out.println(pointInt.toString());

        Point<String> pointStr = new Point<>("Kamil", "Kuba");
        System.out.println(pointStr.toString());

        Trio<String, Integer, String> trio = new Trio<>("Adam", 10, "Kasia");
        System.out.println(trio.toString());

    }
}