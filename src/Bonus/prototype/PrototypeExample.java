package Bonus.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        AnimalCache.initCache();
        Dog dog = (Dog) AnimalCache.getAnimal("Dog");
        dog.setName("Reksio");
        System.out.println("dog = " + dog);

        Dog dog2 = (Dog) AnimalCache.getAnimal("Dog");
        System.out.println("dog2 = " + dog2);

        Cat cat = (Cat) AnimalCache.getAnimal("Cat");
        cat.setName("Kocieł");
        System.out.println("cat = " + cat);

        Cat cat2 = (Cat) AnimalCache.getAnimal("Cat");
        System.out.println("cat2 = " + cat2);
    }
}
