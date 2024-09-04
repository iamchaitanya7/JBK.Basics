package com.jbk.collections;


import java.util.*;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionsEx {
    public static void main (String[] args) {
        List<Integer> integerArrayList = new ArrayList<> ( );
        integerArrayList.add (20);
        integerArrayList.add (10);
        integerArrayList.add (50);
        integerArrayList.add (30);
        integerArrayList.add (40);

        System.out.println (integerArrayList);

        Collections.sort (integerArrayList);

        System.out.println (integerArrayList);
    }
}
