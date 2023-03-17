package Challenge.infiniteLoopChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Wprowadź liczbę lub quit");
            String str = reader.readLine();
            if (str.equalsIgnoreCase("QUIT")) {
                break;
            }
            int num = Integer.parseInt(str);
            number += num;
            System.out.println("number = " + number);
        }
    }

}
