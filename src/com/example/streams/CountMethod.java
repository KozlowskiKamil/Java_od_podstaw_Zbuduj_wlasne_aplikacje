package com.example.streams;

import java.util.ArrayList;

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 230, 30000, 4));
        cars.add(new Car("Citroen", 180, 20000, 3));
        cars.add(new Car("Opel", 220, 15000, 2));
        cars.add(new Car("Merc", 290, 40000, 5));
        cars.add(new Car("BMW", 310, 50000, 4));
        cars.add(new Car("GMC", 250, 45001, 3));
        cars.add(new Car("Porshe", 300, 80000, 5));


        int numCars = (int) cars.stream().filter(car -> car.topSpeed > 230).count(); // rzutowanie
        // long numCars = cars.stream().filter(car -> car.topSpeed > 220).count();

        System.out.println("numCars = " + numCars);


    }
}
