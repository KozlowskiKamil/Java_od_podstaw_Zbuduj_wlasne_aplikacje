package com.example.oop.basic;

class PlaneWithStatic {
    static int nextId = 0;
    int id;
    int x, y;

    static int getNextId() {
        return nextId++;
    }

    public PlaneWithStatic() {
        id = PlaneWithStatic.getNextId(); // albo samo getNextId() bo jesteśmy w klasie
    }

/*    public PlaneWithStatic() {  inkrementacja id w konstuktorze bez używania dodatkowej metody
        id = nextId;
        nextId++;
    }*/
}


public class StaticExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();


        System.out.println("plane id 1 = " + plane1.id);
        System.out.println("plane id 2 = " + plane2.id);
        System.out.println("plane id 3 = " + plane3.id);

        System.out.println(StaticExample.add(3, 2));

        StaticExample sExample = new StaticExample();
        System.out.println(sExample.substract(10, 4));

    }
}
