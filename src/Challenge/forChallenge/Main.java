package Challenge.forChallenge;

public class Main {
    public static void main(String[] args) {
        String names[] = {"Ania", "Ola", "Kasia", "Olek", "Daniel"};
        for (int i = 0; i < names.length; i++) {
            String forward = names[i];
            System.out.println(forward);
        }
        System.out.println("\n");
        for (int i = names.length - 1; i >= 0; i--){
            String backword = names[i];
            System.out.println(backword);
        }
    }
}
