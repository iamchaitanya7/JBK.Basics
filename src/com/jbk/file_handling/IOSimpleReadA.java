package com.jbk.file_handling;

import java.io.*;

public class IOSimpleReadA {
    public static void main (String[] args) throws IOException {

        File newFile = new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetFile.txt");

        FileInputStream fis = new FileInputStream (newFile);
        //byte data [] = fis.readAllBytes();

        //String ans = new String (data);
        //System.out.println (ans);

    }
}


