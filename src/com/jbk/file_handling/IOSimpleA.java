package com.jbk.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOSimpleA {
    public static void main (String[] args) throws IOException {
        String str = "Hello, India.........!";
        byte[] x = str.getBytes ( );

        File file = new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetFile.txt");

        //FileOutputStream fileOutputStream = new FileOutputStream (file);
        FileOutputStream fileOutputStream = new FileOutputStream (file, true);

        fileOutputStream.write (x);
        System.out.println ("Data is Written into the file Successfully...!");
        fileOutputStream.close ( );
    }
}

//For Reading the Data -> InputStream.
//For Writing the Data -> OutputStream.
