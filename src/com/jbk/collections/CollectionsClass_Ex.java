package com.jbk.collections;

import java.util.*;

public class CollectionsClass_Ex {
    public static void main (String[] args) {
        List<Integer> integerArrayList = new ArrayList<> ( );
        integerArrayList.add (20);
        integerArrayList.add (10);
        integerArrayList.add (50);
        integerArrayList.add (30);
        integerArrayList.add (40);

        Collections.sort (integerArrayList);

        System.out.println (integerArrayList);
    }
}
