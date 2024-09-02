package com.jbk.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Ex {
    void separator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        HashMap_Ex line = new HashMap_Ex ( );

        HashMap<Integer, String> hashMap = new HashMap<Integer, String> ( );
        hashMap.put (101, "Chaitanya");
        hashMap.put (102, "Akash");
        hashMap.put (103, "Chetan");
        hashMap.put (104, "Pratik");
        hashMap.put (105, "Sanket");

        line.separator ( );
        System.out.println (hashMap.get (101));         //Displaying the (Value) of Specific (Key).
        line.separator ( );

        System.out.println (hashMap.keySet ( ));         //Displaying all the (Keys) from the associated HashMap.
        line.separator ( );


        //We Can Also Create a (Set) of Integer Type which will Store the (Keys) from the associated HashMap.
        Set<Integer> keySet = hashMap.keySet ( );
        for (Integer i : keySet) {
            System.out.println (i);         //Using a For Loop to Display all the Keys Captured in the (keySet).
        }
        line.separator ( );







    }
}
