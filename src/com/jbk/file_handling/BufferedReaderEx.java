package com.jbk.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main (String[] args) throws Exception {
        File file = new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetBufferedFile.txt");

        FileReader fileReader = new FileReader (file);
        BufferedReader bufferedReader = new BufferedReader (fileReader);

        //Each charcter can be read in this way also.
        /*int charc = 0;
        while (charc != -1){
            charc = bufferedReader.read ( );
            System.out.print((char) charc);
        }*/

        //Alternate Way to read character.
        char ch = 0;
        while (ch != -1) {
            ch = (char) bufferedReader.read ( );
            System.out.print (ch);
            //Thread.currentThread ().sleep(1000);      Can be added to check each character traversal.
        }
        Thread.sleep (1000);      //Can be added to check each character traversal.

    }
}
