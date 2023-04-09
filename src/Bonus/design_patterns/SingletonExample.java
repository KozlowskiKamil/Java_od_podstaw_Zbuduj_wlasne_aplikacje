package Bonus.design_patterns;

class SingletonPattern {
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
        // inicjacja połączenia z  baza danych tylko 1 raz
    }

    public static SingletonPattern getInstance() {
        return instance;
    }

    public void getDBConnection() {
        System.out.println("DB Connection");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        SingletonPattern sinhleton1 = SingletonPattern.getInstance();
        sinhleton1.getDBConnection();

        SingletonPattern sinhleton2 = SingletonPattern.getInstance();
        sinhleton2.getDBConnection();

        System.out.println(sinhleton1 == sinhleton2);
    }
}