package Challenge.StringMethodsChallenge;

public class Main {
    public static void main(String[] args) {
        String text = "Ola ma kota ";
        text = text.repeat(3);
        System.out.println("text = " + text);

        text = text.replaceAll("Ola", "Kasia");
        System.out.println("text = " + text);

        text = text.replaceFirst("Kasia", "Monika");
        System.out.println("text = " + text);

        int index = text.indexOf("Kasia");
        System.out.println("index = " + index);

        index = text.lastIndexOf("Kasia");
        System.out.println("index = " + index);

        text.substring(index);

    }
}
