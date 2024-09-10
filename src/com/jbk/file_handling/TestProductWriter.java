package com.jbk.file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestProductWriter {
    public static void main (String[] args) throws Exception {
        Product product1 = new Product (101, "Pen", 900);
        Product product2 = new Product (102, "Laptop", 10000);
        Product product3 = new Product (103, "Book", 700);
        Product product4 = new Product (104, "Bagpack", 5000);
        Product product5 = new Product (105, "Mobile", 20000);

        ArrayList<Product> productArrayList = new ArrayList<Product> ( );
        productArrayList.add (product1);
        productArrayList.add (product2);
        productArrayList.add (product3);
        productArrayList.add (product4);
        productArrayList.add (product5);

        ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream (new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetObjectFile.txt")));
        outputStream.writeObject (productArrayList);
        outputStream.close ( );
    }
}
