package Challenge.hashMapChallenge;

import java.util.HashMap;
import java.util.Map;

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

        HashMap<String, Animal> map = new HashMap<>();
        String names[] = {"Kot", "Pies", "Koza", "Puma"};
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], new Animal(names[i]));
        }
        System.out.println("map = " + map.get("Puma"));

        for (Map.Entry<String, Animal> print : map.entrySet()) {
            String key = print.getKey();
            Animal animal = print.getValue();
            System.out.println(key + " - " + animal);
        }

    }
}
