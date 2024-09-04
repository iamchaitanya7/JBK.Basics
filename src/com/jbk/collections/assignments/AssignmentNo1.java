package com.jbk.collections.assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentNo1 {
    public static void main (String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<> ( );
        stringArrayList.add ("Hello");
        stringArrayList.add ("Hello, Chaitanya");
        stringArrayList.add ("Hello, Akash");
        stringArrayList.add ("Hello, Pratik");
        stringArrayList.add ("Hello, Sanket");

        System.out.println ("Only Forward Iteration using Iterator");
        Iterator<String> stringIterator = stringArrayList.iterator ( );
        while (stringIterator.hasNext ( )) {
            System.out.println (stringIterator.next ( ));
        }
    }
}
