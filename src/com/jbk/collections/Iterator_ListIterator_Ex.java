package com.jbk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListIterator_Ex {
    void separator () {
        System.out.println ("=============================================");
    }

    public static void main (String[] args) {
        Iterator_ListIterator_Ex line = new Iterator_ListIterator_Ex ( );
        ArrayList<String> stringArrayList = new ArrayList<String> ( );
        stringArrayList.add ("Hello");
        stringArrayList.add ("Hello, Chaitanya");
        stringArrayList.add ("Hello, Akash");
        stringArrayList.add ("Hello, Pratik");
        stringArrayList.add ("Hello, Sanket");

        //Iterator is Used to Perform hasNext() and to iterate Only forward and not allowed backward.
        line.separator ( );
        System.out.println ("Only Forward Iteration using Iterator");
        Iterator<String> stringIterator = stringArrayList.iterator ( );
        while (stringIterator.hasNext ( )) {
            System.out.println (stringIterator.next ( ));
        }
        line.separator ( );

        //ListIterator is Used to Perform hasNext() and hasPrevious() to iterate over forward and backward.
        System.out.println ("Forward Iteration using ListIterator");
        ListIterator<String> stringListIterator = stringArrayList.listIterator ( );
        while (stringListIterator.hasNext ( )) {
            System.out.println (stringListIterator.next ( ));
        }
        line.separator ( );

        System.out.println ("Previous Iteration using ListIterator");
        ListIterator<String> stringListIterator2 = stringArrayList.listIterator ( );
        while (stringListIterator2.hasPrevious ( )) {
            System.out.println (stringListIterator2.previous ( ));
        }
        line.separator ( );
    }
}
