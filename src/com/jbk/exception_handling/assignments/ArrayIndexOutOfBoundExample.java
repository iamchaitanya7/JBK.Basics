package com.jbk.exception_handling.assignments;

public class ArrayIndexOutOfBoundExample {
    public static void main (String[] args) {
        try {
            int[] a = new int[10];       // Array has only 10 elements
            a[11] = 9;                   //Trying to Access 11 elements which is not Available
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("ArrayIndexOutOfBounds Exception");
        }
    }
}