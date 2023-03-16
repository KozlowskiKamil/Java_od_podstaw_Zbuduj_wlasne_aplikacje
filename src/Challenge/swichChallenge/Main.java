package Challenge.swichChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seson = null;
        System.out.println("Podaj numer miesiąca");
        int monthNum = scanner.nextInt();
        switch (monthNum) {
            case 3, 4, 5 -> seson = "Wiosna";
            case 6, 7, 8 -> seson = "Lato";
            case 9, 10, 11 -> seson = "Jesień";
            case 12, 1, 2 -> seson = "Zima";
        }
        System.out.println(seson);
    }
}
