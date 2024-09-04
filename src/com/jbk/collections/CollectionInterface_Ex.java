package com.jbk.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface_Ex {
    public static void main (String[] args) {
        Collection<Integer> integerCollection = new ArrayList<> ( );
        integerCollection.add (10);
        integerCollection.add (20);
        integerCollection.add (30);
        integerCollection.add (40);
        integerCollection.add (50);

        System.out.println (integerCollection);

    }
}
