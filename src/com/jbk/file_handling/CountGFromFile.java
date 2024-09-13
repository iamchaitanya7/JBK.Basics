package com.jbk.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountGFromFile {
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
        /*char ch = 0;
        char t = 'g';
        int counter = 0;
        while (ch != -1) {
            ch = (char) bufferedReader.read ( );
            if (ch == 'g' || ch == 'G') {
                counter++;
            }
            //System.out.print (ch);
            //Thread.currentThread ().sleep(1000);      Can be added to check each character traversal.
        }
        System.out.print ("Counter: " + counter);*/

        //WAP to count no of G's in the file sequence.

        int totalGs = 0;

        String line;
        while ((line = bufferedReader.readLine ( )) != null) {
            // Count occurrences of 'g' (case-insensitive)
            totalGs += line.toLowerCase ( ).chars ( ).filter (ch -> ch == 'g').count ( );
        }
        System.out.println ("Total occurrences of 'g': " + totalGs);

    }
}


