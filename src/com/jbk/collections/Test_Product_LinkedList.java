package com.jbk.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test_Product_LinkedList {
    void lineSeparator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        Test_Product_LinkedList obj = new Test_Product_LinkedList ( );
        Product p1 = new Product (101, "Notebook", 500);
        Product p2 = new Product (102, "College Bag", 2500);
        Product p3 = new Product (103, "Pen", 1000);
        Product p4 = new Product (104, "Pendrive", 1500);
        Product p5 = new Product (105, "Laptop", 50000);

        //Linked List Creation from Collections Framework.
        LinkedList<Product> productLinkedList = new LinkedList<> ( );
        //linkedList.add() Used to Addd the Specified Object to the LinkedList
        productLinkedList.add (p1);
        productLinkedList.add (p2);
        productLinkedList.add (p3);
        productLinkedList.add (p4);
        productLinkedList.add (p5);

        //linkedList.remove() Used to Remove the Specified Object from the LinkedList
        productLinkedList.remove (p5);

        //linkedList.clear() Used to Clear the Complete Objects from the LinkedList
        //productLinkedList.clear ();

        productLinkedList.add (p5);
        productLinkedList.add (p5);
        //We Can Add multiple Duplicate objects into a single LinkedList, and Similarly we can also remove() this multiple Duplicate Objects.

        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productLinkedList) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of LinkedList.
        System.out.println ("Size of Arraylist: " + productLinkedList.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productLinkedList.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        ListIterator<Product> Itr = productLinkedList.listIterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productLinkedList.size ( ); i++) {
            System.out.println (productLinkedList.get (i));
        }
        obj.lineSeparator ( );

        //Using the For-Each Loop to Display Data Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productLinkedList.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}