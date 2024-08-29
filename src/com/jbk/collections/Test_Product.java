package com.jbk.collections;

import java.util.ArrayList;

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

        ArrayList<Product> productArrayList = new ArrayList<> ( );
        productArrayList.add (p1);
        productArrayList.add (p2);
        productArrayList.add (p3);
        productArrayList.add (p4);
        productArrayList.add (p5);

        obj.lineSeparator ( );
        for (Product p : productArrayList) {
            System.out.println (p);
        }
        obj.lineSeparator ( );
    }
}
