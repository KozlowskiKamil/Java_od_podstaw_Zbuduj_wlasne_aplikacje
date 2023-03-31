package Challenge.zooChallenge;

import java.util.ArrayList;

public class Zoo<T extends Animal> {
    private ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    public void printAllAnimals() {
        for (Animal animal : animals) {
            System.out.println("animal = " + animal);
        }
    }
}