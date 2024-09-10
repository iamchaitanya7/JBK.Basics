package com.jbk.file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {
    public static void main (String[] args) throws Exception {
        String[] str = {"Hello", "Chaitanya", "Akash", "Pratik"};

        FileWriter fileWriter = new FileWriter ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetBufferedFile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);

        // Write the content to the file
        bufferedWriter.write (str[0]);
        //bufferedWriter.newLine ();            Used to append the data onto newLine of the file.
        bufferedWriter.write (str[1]);
        bufferedWriter.write (str[2]);
        bufferedWriter.write (str[3]);
        bufferedWriter.close ( );
        System.out.println ("Data written successfully to targetBufferedFile.txt!");

    }
}