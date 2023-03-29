package Challenge.StringBuilderChallenge;

public class Main {
    public static void main(String[] args) {
        String names[] = {"Ola", "Kasia", "Kuba", "Daniel"};
        StringBuilder builder = new StringBuilder();

        for (String s : names) {
            builder.append(s);
            builder.append(" ");
            System.out.println("builder = " + builder);
        }

    }
}
