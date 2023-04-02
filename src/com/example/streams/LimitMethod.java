package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 230, 30000, 4));
        cars.add(new Car("Citroen", 180, 20000, 3));
        cars.add(new Car("Opel", 220, 15000, 2));
        cars.add(new Car("Merc", 290, 40000, 5));
        cars.add(new Car("BMW", 310, 50000, 4));
        cars.add(new Car("GMC", 250, 45001, 3));
        cars.add(new Car("Porshe", 300, 80000, 5));

        List<Car> list = cars.stream().filter(car -> car.price < 50000).limit(3).collect(Collectors.toList());
        System.out.println("list = " + list);
    }
}
