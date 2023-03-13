package Challenge.depositChallenge;

public class Main {
    public static void main(String[] args) {
        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float intrest = deposit * numDays * interestRate / daysInYear;
        System.out.println("Przychód z lokaty: " + intrest);
        float taxValue = intrest * tax;
        System.out.println("Podatek " + taxValue);
        float incomeAfterTax = intrest - taxValue;
        System.out.println("Zysk po potrąceniu podatku " + incomeAfterTax);

    }
}
