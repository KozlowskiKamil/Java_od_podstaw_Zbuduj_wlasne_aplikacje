package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");

        String strEl = (String) basicList.get(0);
        System.out.println("strEl = " + strEl);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kasia");
        arrayList.add("Adam");
        arrayList.add("Anna");
        arrayList.add("Ola");
        arrayList.remove(1);
        arrayList.add("Olek");

        for (String s : arrayList) {
            System.out.println("s = " + s);
        }
/*        s = Kasia
        s = Kasia
        s = Ola
        s = olek*/

        arrayList.add(0, "Zuza");
        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }
        arrayList.set(1, "Kamil");
        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }

        System.out.println("---------------");
        Collections.sort(arrayList);
        for (String s : arrayList) {
            System.out.println("s = " + s);
        }

        arrayList.remove(0);
        for (String s :
                arrayList) {
            System.out.println("s = " + s);
        }
    }
}