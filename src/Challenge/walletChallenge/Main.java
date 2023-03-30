package Challenge.walletChallenge;

class Wallet {
    float money;

    Wallet() {
        money = 3000;
    }

    Wallet(float amount) {
        this.money = amount;
    }

    public void addMoney(float amount) {
        this.money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printAmount() {
        System.out.println("money = " + money);
    }

}

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        for (int i = 1; i <= 6; i++) {
            System.out.println("Miesiąc = " + i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
            wallet.printAmount();
        }

    }
}
