package com.jbk.exception_handling;

public class A_Exception {
    public static void main (String[] args) {
        try{
            int a [] = {3, 6, 78, 69, 50, 39};
            System.out.println (a[7]);
        }
        catch (Exception e) {
            System.out.println("Error Occured is: " + e);
        }


        /*
        int a [] = {3, 6, 78, 69, 50, 39};
        System.out.println (a[7]);

        //Code will break here due to "java.lang.ArrayIndexOutOfBoundsException" exception.

        */
    }
}
