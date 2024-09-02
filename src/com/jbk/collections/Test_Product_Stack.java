package com.jbk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Test_Product_Stack {
    void lineSeparator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        Test_Product_Stack obj = new com.jbk.collections.Test_Product_Stack ( );

        Product p1 = new Product (101, "Notebook", 500);
        Product p2 = new Product (102, "College Bag", 2500);
        Product p3 = new Product (103, "Pen", 1000);
        Product p4 = new Product (104, "Pendrive", 1500);
        Product p5 = new Product (105, "Laptop", 50000);

        //Array List Creation from Collections Framework.
        Stack<Product> productStack = new Stack<> ( );

        //arrayList.add() Used to Add the Specified Object to the ArrayList.
        productStack.add (p1);
        productStack.add (p2);
        productStack.add (p3);
        productStack.add (p4);
        productStack.add (p5);

        //arrayList.remove() Used to Remove the Specified Object from the ArrayList.
        productStack.remove (p5);

        //arrayList.clear() Used to Clear the Complete Objects from the ArrayList.
        //productArrayList.clear ();

        productStack.add (p5);
        productStack.add (p5);
        //We Can Add multiple Duplicate objects into a Single Arraylist, and Similarly we can also remove() this multiple Duplicate Objects.

        obj.lineSeparator ( );
        //Using For Loop to Display the Data.
        System.out.println ("Displaying Data Using For Loop");
        obj.lineSeparator ( );
        for (Product p : productStack) {
            System.out.println (p);
        }
        obj.lineSeparator ( );

        //Displays the size of ArrayList.
        System.out.println ("Size of Arraylist: " + productStack.size ( ));
        obj.lineSeparator ( );

        //Using ListIterator to Display the Data.
        System.out.println ("Displaying Data Using ListIterator");
        obj.lineSeparator ( );
        ListIterator<Product> listItr = productStack.listIterator ( );
        while (listItr.hasNext ( )) {
            Product t = listItr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using Iterator to Display the Data.
        System.out.println ("Displaying Data Using Iterator");
        obj.lineSeparator ( );
        Iterator<Product> Itr = productStack.iterator ( );
        while (Itr.hasNext ( )) {
            Product t = Itr.next ( );
            System.out.println (t);
        }
        obj.lineSeparator ( );

        //Using the For Loop to Display Data.
        System.out.println ("Displaying the Data using Simple For Loop");
        obj.lineSeparator ( );
        for (int i = 0; i < productStack.size ( ); i++) {
            System.out.println (productStack.get (i));
        }
        obj.lineSeparator ( );

        //Using the For-Each Loop to Display Data, Supported by Java-8.
        System.out.println ("Displaying the Data using For-Each Loop");
        obj.lineSeparator ( );
        productStack.forEach (product -> System.out.println (product));
        obj.lineSeparator ( );
    }
}