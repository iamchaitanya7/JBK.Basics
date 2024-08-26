package com.jbk.exception_handling;

import java.util.Scanner;

public class try_catch{
    public static void main (String[] args) {
        int [] a = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter The Index to Search: " );
        int index = scanner.nextInt ();

        try {
            System.out.println (a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace ();
            //throw new RuntimeException (e);
        }
        System.out.println ("Bye Bye");
    }
}
