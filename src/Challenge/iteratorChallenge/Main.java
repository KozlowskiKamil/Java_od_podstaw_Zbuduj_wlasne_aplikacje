package Challenge.iteratorChallenge;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
    protected String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product("Product #" + i));
        }
        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product prod = iterator.next();
            System.out.println("prod = " + prod);
        }


    }
}
