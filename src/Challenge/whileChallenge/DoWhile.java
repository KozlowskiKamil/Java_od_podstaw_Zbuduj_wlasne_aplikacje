package Challenge.whileChallenge;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            if (i % 2 != 0) {
                System.out.println("Liczba " + i + " jest nieparzysta.");
            }
            i++;
        } while (i <= 20);
    }
}
