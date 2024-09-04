package com.jbk.collections.assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentNo2 {
    public static void main (String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<> ( );
        stringArrayList.add ("Hello");
        stringArrayList.add ("Hello, Chaitanya");
        stringArrayList.add ("Hello, Akash");
        stringArrayList.add ("Hello, Pratik");
        stringArrayList.add ("Hello, Sanket");

        System.out.println (stringArrayList);

        System.out.println ("Element at Index 1: " + stringArrayList.get (1));
        System.out.println ("Does the List Contain JAVA: " + stringArrayList.contains ("JAVA"));
        System.out.println ("Is ArrayList Empty: " + stringArrayList.isEmpty ( ));
        System.out.println ("Index of Hello is: " + stringArrayList.indexOf ("Hello"));
        System.out.println ("Size of ArrayList is: " + stringArrayList.size ( ));
    }
}
