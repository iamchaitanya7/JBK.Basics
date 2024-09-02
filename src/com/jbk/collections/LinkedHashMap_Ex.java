package com.jbk.collections;

import java.util.*;

public class LinkedHashMap_Ex {
    void separator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        LinkedHashMap_Ex line = new LinkedHashMap_Ex ( );

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String> ( );
        linkedHashMap.put (101, "Chaitanya");
        linkedHashMap.put (102, "Akash");
        linkedHashMap.put (103, "Chetan");
        linkedHashMap.put (104, "Pratik");
        linkedHashMap.put (105, "Sanket");

        line.separator ( );
        System.out.println ("Size of LinkedHashMap: " + linkedHashMap.size ( ));         //Displaying the (Value) of Specific (Key).
        line.separator ( );

        line.separator ( );
        System.out.println ("Value of Specified Key: " + linkedHashMap.get (101));         //Displaying the (Value) of Specific (Key).
        line.separator ( );

        System.out.println ("Direct Keys from LinkedHashMap: " + linkedHashMap.keySet ( ));         //Displaying all the (Keys) from the associated HashMap.
        line.separator ( );


        //We Can Also Create a (Set) of Integer Type which will Store the (Keys) from the associated LinkedHashMap.
        Set<Integer> keySet = linkedHashMap.keySet ( );
        System.out.println ("Keys from LinkedHashMap");
        line.separator ( );
        for (Integer i : keySet) {
            System.out.println (i);         //Using a For Loop to Display all the Keys Captured in the (keySet).
        }
        line.separator ( );

        /*Method to Create a (Collection) of (String) which will Store the (Values) from the associated LinkedHashMap,
        Display the (Values) using the for Loop. */
        Collection<String> valuesCollection = linkedHashMap.values ( );
        System.out.println ("Values from LinkedHashMap: ");
        line.separator ( );
        for (String str : valuesCollection) {
            System.out.println (str);
        }
        line.separator ( );


        /*Method to Create a (Set) of (Integer, String) which will Store the (Keys, Values) from the associated LinkedHashMap,
        Display the (Keys, Values) using the for Loop. */
        System.out.println ("Entries from LinkedHashMap: ");
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet ( );
        line.separator ( );
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println (entry.getKey ( ) + " " + entry.getValue ( ));
        }
        line.separator ( );

        //Display the (Keys, Values) using the for-each Loop which are associated with the LinkedHashMap.
        System.out.println ("Entries from LinkedHashMap Using For-Each: ");
        line.separator ( );
        linkedHashMap.forEach ((key, values) -> System.out.println (key + " " + values));
        line.separator ( );

        //Display the (Keys) using the for-each Loop which are associated with the LinkedHashMap.
        System.out.println ("Keys from LinkedHashMap Using For-Each: ");
        line.separator ( );
        linkedHashMap.forEach ((key, values) -> System.out.println (key));
        line.separator ( );

        //Display the (Keys, Values) using the for-each Loop which are associated with the LinkedHashMap.
        System.out.println ("Values from LinkedHashMap Using For-Each: ");
        line.separator ( );
        linkedHashMap.forEach ((key, values) -> System.out.println (values));
        line.separator ( );

    }
}