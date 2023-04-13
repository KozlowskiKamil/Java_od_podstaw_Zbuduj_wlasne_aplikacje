package Challenge.arrayListChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.println("names index[0] = " + names.get(0));
        names.set(2, "Olek");
        names.add("Karol");
        names.remove(0);
        for (String s :
                names) {
            System.out.println("s = " + s);
        }
    }
}