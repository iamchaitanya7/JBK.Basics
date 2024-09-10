package com.jbk.file_handling;

import java.io.*;
import java.util.ArrayList;

public class TestProductReader {
    public static void main (String[] args) throws Exception {

        ObjectInputStream objectInputStream = new ObjectInputStream (new FileInputStream (new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetObjectFile.txt")));

        ArrayList<Product> products;
        products = (ArrayList<Product>) objectInputStream.readObject ( );
        objectInputStream.close ( );
        products.forEach (product -> System.out.println (product));

    }
}
