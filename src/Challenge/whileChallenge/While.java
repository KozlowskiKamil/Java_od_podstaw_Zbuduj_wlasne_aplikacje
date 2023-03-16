package Challenge.whileChallenge;

public class While {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int i = 0;
        while (i < numbers.length) {
            int num = numbers[i];
            System.out.println(num * 2);
            i++;
        }
    }
}
