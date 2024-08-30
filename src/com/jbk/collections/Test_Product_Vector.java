package com.jbk.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test_Product_Vector {
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

        //Vector Creation from Collections Framework.
        Vector<Product> productVector = new Vector<> ( );
        //vector.add() Used to Add the Specified Object to the Vector.
        productVector.add (p1);
        productVector.add (p2);
        productVector.add (p3);
        productVector.add (p4);
        productVector.add (p5);

        //vector.remove() Used to Remove the Specified Object from the Vector.
        productVector.remove (p5);

        //vector.clear() Used to Clear the Complete Objects from the Vector.
        //productVector.clear ();

        productVector.add (p5);
        productVector.add (p5);
        //We Can Add multiple Duplicate objects into a single Vector, and Similarly we can also remove() this multiple Duplicate Objects.

        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productVector) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of LinkedList.
        System.out.println ("Size of Arraylist: " + productVector.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productVector.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        Iterator<Product> Itr = productVector.iterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productVector.size ( ); i++) {
            System.out.println (productVector.get (i));
        }
        obj.lineSeparator ( );

        //Using the For-Each Loop to Display Data Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productVector.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}