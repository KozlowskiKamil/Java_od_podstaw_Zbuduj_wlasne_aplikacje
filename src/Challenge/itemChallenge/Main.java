package Challenge.itemChallenge;
// TODO: 08.04.2023 zrobione, ale do powtórzenia

class Item {
    static int numItems = 0;
    final int ID;

    public Item(int id) {
        this.ID = id;
    }

    static int getNextId() {
        return Item.numItems++;
    }

    static Item getItem() {
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }

    static void printNumItems() {
        System.out.println("numItems = " + Item.numItems);
    }

    public void printId() {
        System.out.println("ID = " + this.ID);
    }

}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Item item = Item.getItem();
            item.printId();
        }
        Item.printNumItems();
    }

}
