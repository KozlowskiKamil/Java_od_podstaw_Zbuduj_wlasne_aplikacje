package com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        System.out.println(list); // [Rafał, Adam, Ola, Olek]
        System.out.println(list.getFirst()); // Rafał
        System.out.println(list.getLast()); // Olek

        list.removeLast();
        list.removeFirst();
        System.out.println(list); // [Adam, Ola]

        System.out.println(list.contains(p1));
        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");

        System.out.println(list); // [Adam, Daniel, Kuba, Ola]

        list.add(2, "Zenon");
        list.set(0, "Katarzyna");
        System.out.println(list.size());

        System.out.println("--------------111");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("str = " + str);
        }
//        str = Katarzyna
//        str = Daniel
//        str = Zenon
//        str = Kuba
//        str = Ola

        System.out.println("--------------");
        ListIterator<String> iterator1 = list.listIterator(list.size());
        while (iterator1.hasPrevious()) {
            String str = iterator1.previous();
            System.out.println("str = " + str);
        }
//        str = Ola
//        str = Kuba
//        str = Zenon
//        str = Daniel
//        str = Katarzyna

    }
}
