package com.example.streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 230, 30000, 4));
        cars.add(new Car("Citroen", 180, 20000, 3));
        cars.add(new Car("Opel", 220, 15000, 2));
        cars.add(new Car("Merc", 290, 40000, 5));
        cars.add(new Car("BMW", 280, 50000, 4));
        cars.add(new Car("GMC", 250, 45000, 3));
        cars.add(new Car("Porshe", 300, 80000, 5));
        cars.add(new Car("Porshe", 300, 80000, 5));
        cars.add(new Car("BMW", 280, 50000, 4));
        cars.add(new Car("Merc", 290, 40000, 5));

        Set<Car> set = cars.stream().filter(car -> car.price > 30000).collect(Collectors.toSet());

        set.forEach(car -> System.out.println("car = " + car));
    }
}
