package Challenge.ifChallenge;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        int weight;

        System.out.println("Podaj swój wiek");
        age = scanner.nextInt();
        System.out.println("Podaj swoją wagę");
        weight = scanner.nextInt();
        if (age >= 18) {
            if (weight > 49) {
                System.out.println("Możesz oddać krew");
            } else System.out.println("Masz zbyt niską wagę");
        } else System.out.println("Jesteś za młody");
    }
}
