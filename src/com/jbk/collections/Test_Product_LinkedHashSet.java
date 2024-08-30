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

        //linked List Creation from Collections Framework.
        LinkedHashSet<Product> productLinkedHashSet = new LinkedHashSet<> ( );
        //linkedList.add() Used to Remove the Specified Object from the ArrayList
        productLinkedHashSet.add (p1);
        productLinkedHashSet.add (p2);
        productLinkedHashSet.add (p3);
        productLinkedHashSet.add (p4);
        productLinkedHashSet.add (p5);

        //linkedList.remove() Used to Remove the Specified Object from the ArrayList
        productLinkedHashSet.remove (p5);

        //linkedList.clear() Used to Clear the Complete Objects from the ArrayList
        //productLinkedList.clear ();

        productLinkedHashSet.add (p5);
        productLinkedHashSet.add (p5);
        //We Can Add multiple Duplicate objects into a single Arraylist and Similarly we can also remove() this multiple Duplicate Objects.

        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productLinkedHashSet) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of LinkedList.
        System.out.println ("Size of Arraylist: " + productLinkedHashSet.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        /*System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productLinkedHashSet.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );*/

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
        /*System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productLinkedHashSet.size ( ); i++) {
            System.out.println (productLinkedHashSet.get (i));
        }
        obj.lineSeparator ( );*/

        //Using the For-Each Loop to Display Data Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productLinkedHashSet.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}