package com.jbk.collections;

import java.util.HashMap;

public class HashMap_Ex {
    public static void main (String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String> ( );

        hashMap.put (101, "Chaitanya");
        hashMap.put (102, "Akash");
        hashMap.put (103, "Chetan");
        hashMap.put (104, "Pratik");
        hashMap.put (105, "Sanket");

        System.out.println (hashMap.get (101));

    }
}
