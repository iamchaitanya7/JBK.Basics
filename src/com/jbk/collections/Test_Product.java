package com.jbk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test_Product {
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

        //Array List Creation from Collections Framework.
        ArrayList<Product> productArrayList = new ArrayList<> ( );
        //arrayList.add() Used to Add the Specified Object to the ArrayList.
        productArrayList.add (p1);
        productArrayList.add (p2);
        productArrayList.add (p3);
        productArrayList.add (p4);
        productArrayList.add (p5);

        //arrayList.remove() Used to Remove the Specified Object from the ArrayList.
        productArrayList.remove (p5);

        //arrayList.clear() Used to Clear the Complete Objects from the ArrayList.
        //productArrayList.clear ();

        productArrayList.add (p5);
        productArrayList.add (p5);
        //We Can Add multiple Duplicate objects into a Single Arraylist, and Similarly we can also remove() this multiple Duplicate Objects.

        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productArrayList) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of ArrayList.
        System.out.println ("Size of Arraylist: " + productArrayList.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productArrayList.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        Iterator<Product> Itr = productArrayList.iterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productArrayList.size ( ); i++) {
            System.out.println (productArrayList.get (i));
        }
        obj.lineSeparator ( );

        //Using the For-Each Loop to Display Data, Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productArrayList.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}