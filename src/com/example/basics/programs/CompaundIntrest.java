package com.example.basics.programs;

import java.util.Scanner;

public class CompaundIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyIntrerest = 0;
        int numYears = 0;
        double finalCapital; // rezultat oszczędzania

        System.out.println("Wpisz kapitał początkowy");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocętowanie 5 to 5%");
        yearlyIntrerest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania");
        numYears = in.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyIntrerest / 100.0d), numYears);

        System.out.println("Efekt oszczędzania z procętem składanym = " + Math.round(finalCapital));
    }
}
