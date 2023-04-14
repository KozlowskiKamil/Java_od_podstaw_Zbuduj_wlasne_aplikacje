package Bonus.abstract_factory;

public class Volvo implements CarInterface {
    private String name;


    public Volvo(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Volvo{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Volvo driving");
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
