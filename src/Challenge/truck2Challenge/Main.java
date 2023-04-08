package Challenge.truck2Challenge;


class Truck {
    String producent, model, kolor;
    int iloscKol;
    final int TOP_SPEED = 100;
    final int ACCELERATION;

    public Truck() {
        producent = "Freightliner";
        model = "9664";
        iloscKol = 6;
        ACCELERATION = 60;
    }

    public Truck(String kolor) {
        this();
        this.kolor = kolor;
    }
    public void printInfo(){
        System.out.println("producent = " + producent);
        System.out.println("model = " + model);
        System.out.println("kolor = " + kolor);
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("żółty");
        truck.printInfo();

    }
}
