package Challenge.bmiChallenge;

public class Main {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;
        float heightPow = (float) Math.pow(height, 2);
        System.out.println("Wzrost do potęgi: " + heightPow);

        double bmi = weight / heightPow;
        System.out.println("Wynik BMI: " + bmi);
        int bmiInt = (int) bmi;
        System.out.println(bmiInt);

    }
}
