package Challenge.roadsterChallenge;

public class Main {
    public static void main(String[] args) {
        Roadster roadster = new Roadster(100, 50, 200, 100, true);

        System.out.println("roadster getTopspeed= " + roadster.getTopspeed());
        System.out.println("roadster getAcceleration= " + roadster.getAcceleration());
        System.out.println("roadster getTopspeed= " + roadster.getTopspeed(true));
        System.out.println("roadster getAcceleration= " + roadster.getAcceleration(true));

    }
}
