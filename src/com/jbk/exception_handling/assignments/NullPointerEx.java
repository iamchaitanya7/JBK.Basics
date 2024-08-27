package com.jbk.exception_handling.assignments;

public class NullPointerEx {
    public static void main (String[] args) {
        try {
            String str = null;
            System.out.println (str.length ( )); //Exception will occur on this line
        } catch (NullPointerException e) {
            System.out.println ("NullPointerException..");
        }
    }
}
