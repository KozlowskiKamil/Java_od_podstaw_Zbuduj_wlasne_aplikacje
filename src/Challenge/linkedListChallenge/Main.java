package Challenge.linkedListChallenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

class Animal {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();
        String anmalsAdd[] = {"Dog", "Cat", "Tiger", "Lion", "Panda", "Donkey"};
        Random random = new Random();


        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(anmalsAdd.length);
            animals.add(new Animal(anmalsAdd[x]));
        }
        for (Animal s : animals) {
            System.out.println("s = " + s);
        }
        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal(anmalsAdd[2]));
        animals.addLast(new Animal(anmalsAdd[3]));

        System.out.println("-------------------");
        ListIterator<Animal> iterator = animals.listIterator();
        while (iterator.hasNext()) {
            Animal str = iterator.next();
            System.out.println("str = " + str);
        }


    }
}
