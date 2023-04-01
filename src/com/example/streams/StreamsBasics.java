package com.example.streams;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Zenon");
        arr.add("Kamil");
        arr.add("Basia");
        arr.add("Ola");
        arr.add("Daniel");
        arr.add("Ada");
        arr.add("Kuba");

        arr.stream().filter(str -> str.length() > 4 && str.length() < 7)
                .filter(str -> str.startsWith("K") || str.startsWith("D"))
                .forEach(str -> System.out.println("str = " + str));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 230, 30000, 4));
        cars.add(new Car("Citroen", 180, 20000, 3));
        cars.add(new Car("Opel", 220, 15000, 2));
        cars.add(new Car("Merc", 290, 40000, 5));
        cars.add(new Car("BMW", 280, 50000, 4));
        cars.add(new Car("GMC", 250, 45000, 3));
        cars.add(new Car("Porshe", 300, 80000, 5));

        cars.stream().filter(car -> car.rating > 3)
                .filter(car -> car.price >= 20000 && car.price < 70000)
                .filter(car -> car.topSpeed > 200 && car.topSpeed < 290)
                .forEach(car -> System.out.println("car = " + car.toString()));

    }
}
