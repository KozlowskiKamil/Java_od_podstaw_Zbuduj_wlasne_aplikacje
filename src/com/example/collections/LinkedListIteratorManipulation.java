package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("Ola")) {
                iterator.set("Zuza");
            }
            if (str.equalsIgnoreCase("Adam")) {
                iterator.add("Kamil");
            }
            if (str.equalsIgnoreCase("Rafał")) {
                iterator.remove();
            }
        }
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println("iterator1 = " + iterator1.next());
            String str = iterator1.next();
            System.out.println("str = " + str);

        }
    }
}
