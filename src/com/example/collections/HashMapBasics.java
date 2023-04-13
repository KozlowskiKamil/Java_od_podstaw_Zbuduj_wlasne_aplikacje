package com.example.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Employee> map = new HashMap<>();
        map.put("Adam", new Employee("Adam1"));
        map.put("Kasia", new Employee("Kasia1"));
        map.put("Ola", new Employee("Ola1"));
        map.put("Kamil", new Employee("Kamil1"));

        Employee e = map.get("Kamil");
        System.out.println("e = " + e);

        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry en = (Map.Entry) i.next();
            String key = (String) en.getKey();
            Employee employee = (Employee) en.getValue();
            System.out.println(key + " - " + employee);
        }

        System.out.println("---------------------");
        for (Map.Entry<String, Employee> entry : map.entrySet()) {
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(key + " - " + employee);
        }
    }
}
