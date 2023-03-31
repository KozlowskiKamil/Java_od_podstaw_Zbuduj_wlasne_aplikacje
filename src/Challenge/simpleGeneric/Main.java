package Challenge.simpleGeneric;


class Square<T extends Number> {
    private T wall;

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public Square(T wall) {
        this.wall = wall;
    }

    public double getSurfaceArea() {
        double result = this.wall.doubleValue();
        return result * result;
    }
}

public class Main {
    public static void main(String[] args) {
        Square<Integer> square1 = new Square<>(10);
        System.out.println("square1 = " + square1.getSurfaceArea());

        Square<Float> square2 = new Square<>(5.7f);
        System.out.println("square2 = " + square2.getSurfaceArea());

        Square<Double> square3 = new Square<>(22.2);
        System.out.println("square3 = " + square3.getSurfaceArea());
    }
}