package com.example.oop.basic;

class DBconnection {
    private static DBconnection instance;

    private DBconnection() {
    }

    public static DBconnection getInstance() {
        if (instance == null) {
            instance = new DBconnection();
        }
        return instance;
    }

    public void getFromDB() {
        System.out.println("Dane z bazy = " + instance);
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        DBconnection connection = DBconnection.getInstance();
        DBconnection connection1 = DBconnection.getInstance();
        System.out.println(connection1 == connection);
        connection1.getFromDB();
    }
}
