package com.tka.practical.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList (5);
        arrayList.add (10);     //0
        arrayList.add (20);     //1
        arrayList.add (30);     //2
        arrayList.add (40);     //3
        arrayList.add (50);     //4
        arrayList.add (60);     //5
        arrayList.add (70);     //6

        //arrayList.add (4,40);
        //arrayList.add (3,50);

        System.out.println (arrayList);

    }
}
