package Challenge.TvChallenge;

class TV {
    String manufacturer;
    String model;
    int productionYear;

    public void printBasic() {
        System.out.println(this.manufacturer + " " + this.model + " " + productionYear);
    }

}

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.manufacturer = "Sony";
        tv.model = "Bravia";
        tv.productionYear = 2021;
        tv.printBasic();
    }
}
