package Challenge.carFactoryChallenge;

class Car {
    String model;
    String brand;
    String color;


    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor() {

        return this.color;
    }

    public void printInfo() {
        System.out.println("model = " + model);
        System.out.println("brand = " + brand);
        System.out.println("color = " + color);
    }

}

class CarFactory {

    public Car buildCar() {
        String colors[] = {"black", "white", "red", "blue", "green"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String randomColor = colors[randIndex];

        return new Car("Ford", "Mustang", randomColor);

    }

}

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory ();
        Car car1 = carFactory.buildCar();
        System.out.println("car1 = " + car1.getColor());
        car1.printInfo();

        Car car2 = carFactory.buildCar();
        car2.printInfo();

    }
}
