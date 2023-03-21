package Challenge.concatChallenge;

public class Main {
    public static void main(String[] args) {
        String names[] = {"Ania", "Darek", "Kuba", "Damian"};
        String str = names[0] + " " + names[1] + " " + names[2] + " " + names[3];
        String str2 = null;
        str2 = str2.join(" ", names[0], names[1], names[2], names[3]);
        System.out.println(str);
        System.out.println(str2);

        String str3 = "";
        for (String s : names) {
            str3 = str3.concat(s);
            str3 = str3.concat(" ");
        }
        System.out.println(str3);
    }
}
