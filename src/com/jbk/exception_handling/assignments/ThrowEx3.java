package com.jbk.exception_handling.assignments;

public class ThrowEx3 {
    static void checkEligibilty (int stuage, int stuweight) {
        if (stuage < 12 && stuweight < 40) {
            throw new ArithmeticException ("Student is not eligible for registration");
        } else {
            System.out.println ("Entries Valid!!");
        }
    }

    public static void main (String[] args) {

        System.out.println ("Welcome to the Registration process!!");
        checkEligibilty (10, 39);
        System.out.println ("Have a nice day..");
    }
}


