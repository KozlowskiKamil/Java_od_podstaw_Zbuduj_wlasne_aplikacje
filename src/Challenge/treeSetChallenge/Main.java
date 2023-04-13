package Challenge.treeSetChallenge;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();


        for (int i = 0; i < 30; i++) {
            int ran = random.nextInt(100);
            numbers.add(ran);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
    }
}
