package Challenge.StringChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Podaj swoje imię: ");
        String name = reader.readLine();
        System.out.println("Twoje imię to: " + name);

        System.out.print("Podaj swoje miejsce zamieszkania: ");
        String home = reader.readLine();
        System.out.println("Twoje miejsce zamieszkania to: " + home);

        String nameHome = name + " mieszka w " + home;
        System.out.println("Twoje imię i miejsce zamieszkania to " + nameHome);
        System.out.println(nameHome.length());
    }
}
