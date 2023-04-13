package Challenge.hashsetChallenge;

import java.util.HashSet;
import java.util.Iterator;

class Car {
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Kasia");
        names.add("Ola");
        names.add("Adam");

        Iterator<String> integer = names.iterator();
        while (integer.hasNext()) {
            String str = integer.next();
            System.out.println("str = " + str);
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Dodge");
        Car car2 = new Car("Citroen");
        Car car3 = new Car("Opel");
        cars.add(car1);
        cars.add(car2);
        cars.add(car1);
        cars.add(car3);

        Iterator<Car> iterator1 = cars.iterator();
        while (iterator1.hasNext()) {
            Car car = iterator1.next();
            System.out.println("car = " + car);
        }

    }
}
