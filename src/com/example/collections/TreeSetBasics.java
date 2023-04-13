package com.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(4);
        treeSet.add(22);
        treeSet.add(33);
        treeSet.add(1);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
        System.out.println("----------------");
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println("descIterator = " + descIterator.next());
        }
    }
}
