package Challenge.ifChallenge;

import java.net.Socket;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        boolean raining = true;
        boolean haveUmbrela = true;
        int temperature = 9;

        if (temperature > 40 || temperature < -20) {
            System.out.println("Nie wychodź zła temperatura");
        } else if ((temperature > -10 && temperature < 10) && raining && haveUmbrela) {
            System.out.println("Temp między -10 a 10 stopni pada wyjdź z parasolem");
        } else if (temperature > 12 && raining == false) {
            System.out.println("Można wyjść piękna pogoda");
        } else System.out.println("Nie wychodź");
    }
}


