package Challenge.arrayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String names[] = {"Ania", "Ola", "Daniel", "Karol", "Kasia"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj numer tablicy od 0 do " + (names.length - 1));
        String str = reader.readLine();
        int number = Integer.parseInt(str);
        System.out.println("Index: " + number + " w tablicy ma wartość: " + names[number]);
    }
}
