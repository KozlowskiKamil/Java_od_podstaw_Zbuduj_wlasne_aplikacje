package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinMethods {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 230, 30000, 4));
        cars.add(new Car("Citroen", 180, 20000, 3));
        cars.add(new Car("Opel", 220, 15000, 2));
        cars.add(new Car("Merc", 290, 40000, 5));
        cars.add(new Car("BMW", 310, 50000, 4));
        cars.add(new Car("GMC", 250, 45001, 3));
        cars.add(new Car("Porshe", 300, 80000, 5));

        Car highPrice = cars.stream().max((car1, car2) -> car1.price > car2.price ? 1 : -1).get();
        System.out.println("highPrice = " + highPrice);

        Car lowestPrice = cars.stream().min((car1, car2) -> car1.price > car2.price ? 1 : -1).get();
        System.out.println("lowestPrice = " + lowestPrice);

        Car topSpeed = cars.stream().max((car1, car2) -> car1.topSpeed > car2.topSpeed ? 1 : -1).get();
        System.out.println("topSpeed = " + topSpeed);

    }
}
