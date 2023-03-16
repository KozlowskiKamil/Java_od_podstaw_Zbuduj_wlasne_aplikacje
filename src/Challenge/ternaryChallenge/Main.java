package Challenge.ternaryChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        String result;
        result = number % 2 == 0 ? "parzysta" : "nieprzysta";
        System.out.println("Liczba " + number + " jest " + result);
    }
}
