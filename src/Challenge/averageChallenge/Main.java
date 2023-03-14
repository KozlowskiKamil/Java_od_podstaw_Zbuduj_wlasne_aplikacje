package Challenge.averageChallenge;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        double result = (double) (a + b + c + d) / 4;
        System.out.println("Średnia z liczb: " + result);
        result++;
        System.out.println("Inkrementacja: " + result);
        result--;
        System.out.println("Dekrementacja: " + result);
    }
}
