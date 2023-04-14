package com.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>();
        test.add(33);
        test.add(99);
        test.add(77);
        test.add(13);

        while (!test.isEmpty()) {
            System.out.println("test = " + test.poll());
        }

        System.out.println("-----------");
        test.add(11);
        test.add(55);
        test.add(8);
        test.add(22);
        System.out.println("test = " + test.peek());
        System.out.println("test = " + test.peek());
    }
}
