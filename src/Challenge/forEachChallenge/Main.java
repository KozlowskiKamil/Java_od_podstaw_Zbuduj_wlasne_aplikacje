package Challenge.forEachChallenge;

public class Main {
    public static void main(String[] args) {

        int number[] = {0, 1, 2, 3, 4, 5};
        int result = 0;
        for (int i : number) {
            result += i;
            System.out.println("result = " + result);
        }
    }
}
