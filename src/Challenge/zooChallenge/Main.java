package Challenge.zooChallenge;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> animalZoo = new Zoo<>();
        animalZoo.addAnimal(new Tiger("Tiger", 12));
        animalZoo.addAnimal(new Lion("Lion", 9));
        animalZoo.addAnimal(new Animal("Coala", 17));
        animalZoo.printAllAnimals();

    }
}
