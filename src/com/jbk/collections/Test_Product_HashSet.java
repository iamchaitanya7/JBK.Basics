package com.jbk.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Test_Product_HashSet {
    void lineSeparator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        Test_Product obj = new Test_Product ( );
        Product p1 = new Product (101, "Notebook", 500);
        Product p2 = new Product (102, "College Bag", 2500);
        Product p3 = new Product (103, "Pen", 1000);
        Product p4 = new Product (104, "Pendrive", 1500);
        Product p5 = new Product (105, "Laptop", 50000);

        Product p6 = new Product (106, "Hello", 1000);

        //HashSet Creation from Collections Framework.
        HashSet<Product> productHashSet = new HashSet<> ( );

        //HashSet.add() Used to Add the Specified Object to the HashSet.
        productHashSet.add (p1);
        productHashSet.add (p2);
        productHashSet.add (p3);
        productHashSet.add (p4);
        productHashSet.add (p5);

        //hashSet.remove() Used to Remove the Specified Object from the HashSet.
        productHashSet.remove (p5);

        //hashSet.clear() Used to Clear the All Objects from the HashSet.
        //productLinkedList.clear ();

        productHashSet.add (p5);
        productHashSet.add (p5);
        //We Cannot Add multiple Duplicate objects into a Single HashSets as it Stores only Unique Values.


        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productHashSet) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of LinkedList.
        System.out.println ("Size of Arraylist: " + productHashSet.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        /*System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productHashSet.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );*/

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        Iterator<Product> Itr = productHashSet.iterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        /*System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productHashSet.size ( ); i++) {
            System.out.println (productHashSet.get (i));
        }
        obj.lineSeparator ( );*/

        //Using the For-Each Loop to Display Data Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productHashSet.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}