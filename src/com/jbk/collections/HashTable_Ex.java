package com.jbk.collections;

import java.util.*;

public class HashTable_Ex {
    void separator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        HashTable_Ex line = new HashTable_Ex ( );

        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String> ( );
        hashtable.put (101, "Chaitanya");
        hashtable.put (102, "Akash");
        hashtable.put (103, "Chetan");
        hashtable.put (104, "Pratik");
        hashtable.put (105, "Sanket");

        line.separator ( );
        System.out.println ("Size of HashTable: " + hashtable.size ( ));         //Displaying the (Size) of HashTable.
        line.separator ( );

        line.separator ( );
        System.out.println ("Value of Specified Key: " + hashtable.get (101));         //Displaying the (Value) of Specific (Key).
        line.separator ( );

        System.out.println ("Direct Keys from HashTable: " + hashtable.keySet ( ));         //Displaying all the (Keys) from the associated HashTable.
        line.separator ( );


        //We Can Also Create a (Set) of Integer Type which will Store the (Keys) from the associated HashTable.
        Set<Integer> keySet = hashtable.keySet ( );
        System.out.println ("Keys from HashTable");
        line.separator ( );
        for (Integer i : keySet) {
            System.out.println (i);         //Using a For Loop to Display all the Keys Captured in the (keySet).
        }
        line.separator ( );

        /*Method to Create a (Collection) of (String) which will Store the (Values) from the associated HashTable,
        Display the (Values) using the for Loop. */
        Collection<String> valuesCollection = hashtable.values ( );
        System.out.println ("Values from HashTable: ");
        line.separator ( );
        for (String str : valuesCollection) {
            System.out.println (str);
        }
        line.separator ( );


        /*Method to Create a (Set) of (Integer, String) which will Store the (Keys, Values) from the associated HashTable and,
        Display the (Keys, Values) using the for Loop. */
        System.out.println ("Entries from HashTable: ");
        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet ( );
        line.separator ( );
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println (entry.getKey ( ) + " " + entry.getValue ( ));
        }
        line.separator ( );

        //Display the (Keys, Values) using the for-each Loop which are associated with the HashTable.
        System.out.println ("Entries from HashTable Using For-Each: ");
        line.separator ( );
        hashtable.forEach ((key, values) -> System.out.println (key + " " + values));
        line.separator ( );

        //Display the (Keys) using the for-each Loop which are associated with the HashTable.
        System.out.println ("Keys from HashTable Using For-Each: ");
        line.separator ( );
        hashtable.forEach ((key, values) -> System.out.println (key));
        line.separator ( );

        //Display the (Keys, Values) using the for-each Loop which are associated with the HashTable.
        System.out.println ("Values from HashTable Using For-Each: ");
        line.separator ( );
        hashtable.forEach ((key, values) -> System.out.println (values));
        line.separator ( );


        //HashTable Doesn't Maintain Insertion Order Sequence.


    }
}