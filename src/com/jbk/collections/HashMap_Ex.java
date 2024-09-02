package com.jbk.collections;

import java.util.*;

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
        System.out.println ("Value of Specified Key: " + hashMap.get (101));         //Displaying the (Value) of Specific (Key).
        line.separator ( );

        System.out.println ("Direct Keys from HashMap: " + hashMap.keySet ( ));         //Displaying all the (Keys) from the associated HashMap.
        line.separator ( );


        //We Can Also Create a (Set) of Integer Type which will Store the (Keys) from the associated HashMap.
        Set<Integer> keySet = hashMap.keySet ( );
        System.out.println ("Keys from HashMap");
        line.separator ( );
        for (Integer i : keySet) {
            System.out.println (i);         //Using a For Loop to Display all the Keys Captured in the (keySet).
        }
        line.separator ( );

        /*Method to Create a Collection of String which will Store the (Values) from the associated HashMap,
        Display the (Values) using the for Loop. */
        Collection<String> valuesCollection = hashMap.values ( );
        System.out.println ("Values from HashMap: ");
        line.separator ( );
        for (String str : valuesCollection) {
            System.out.println (str);
        }
        line.separator ( );

        System.out.println ("Entries from HashMap: ");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet ( );
        line.separator ( );
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println (entry.getKey ( ) + " " + entry.getValue ( ));
        }
        line.separator ( );






    }
}
