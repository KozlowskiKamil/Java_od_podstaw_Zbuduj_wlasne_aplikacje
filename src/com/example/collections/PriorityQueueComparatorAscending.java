package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class AscendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x > y) return 1; // kolejność rosnąca
        else return -1;
    }
}

public class PriorityQueueComparatorAscending {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>(new AscendingComparator());
        test.add(33);
        test.add(99);
        test.add(77);
        test.add(13);

        while (!test.isEmpty()) {
            System.out.println("test = " + test.poll());
        }
    }
}
