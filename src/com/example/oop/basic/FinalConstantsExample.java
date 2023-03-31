package com.example.oop.basic;

class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstants() {
        height = 20;
    }

    PointWithConstants(int posX, int posY) {
        this();
        x = posX;
        y = posY;
    }

    public void changePosition(int newX, final int newY) {
        newX = 30; // zmiana wartości argumentu
        x = newX;
        y = newY;
    }
}

public class FinalConstantsExample {
    public static void main(String[] args) {
        PointWithConstants point = new PointWithConstants(33, 44); // pointX = 33 pointY = 44
        System.out.println("pointX = " + point.x + " pointY = " + point.y);
        point.changePosition(55, 66);
        System.out.println("pointX = " + point.x + " pointY = " + point.y); // pointX = 30 pointY = 66

    }
}