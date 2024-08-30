package com.jbk.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Test_Product_LinkedHashSet {
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

        //LinkedHashSet Creation from Collections Framework.
        LinkedHashSet<Product> productLinkedHashSet = new LinkedHashSet<> ( );

        //linkedHashSet.add() Used to Add the Specified Object to the LinkedHashSet.
        productLinkedHashSet.add (p1);
        productLinkedHashSet.add (p2);
        productLinkedHashSet.add (p3);
        productLinkedHashSet.add (p4);
        productLinkedHashSet.add (p5);

        //linkedHashSet.remove() Used to Remove the Specified Object from the LinkedHashSet.
        productLinkedHashSet.remove (p5);

        //linkedHashSet.clear() Used to Clear the All Objects from the LinkedHashSet.
        //productLinkedList.clear ();

        productLinkedHashSet.add (p5);
        productLinkedHashSet.add (p5);
        //We Cannot Add multiple Duplicate objects into a Single LinkedHashSets.

        //Using For Loop for Displaying the Data.
        obj.lineSeparator ( );
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productLinkedHashSet) {
            System.out.println (p);
        }

        //linkedHashSet.size() Displays the size of LinkedList.
        obj.lineSeparator ( );
        System.out.println ("Size of Arraylist: " + productLinkedHashSet.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.      **Cannot Be Used in the Case of LinkedHashSet**
        /*
        System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productLinkedHashSet.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );
        */

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        Iterator<Product> Itr = productLinkedHashSet.iterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        /*
        System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productLinkedHashSet.size ( ); i++) {
            System.out.println (productLinkedHashSet.get (i));         //**Cannot Use the linkedHashSet.get() Method**
        }
        obj.lineSeparator ( );
        */

        //Using the For-Each Loop to Display Data. **Supported by Java-8.**
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productLinkedHashSet.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}