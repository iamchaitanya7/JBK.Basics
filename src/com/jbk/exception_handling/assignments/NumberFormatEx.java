package com.jbk.exception_handling.assignments;

public class NumberFormatEx {

    public static void main (String[] args) {
        try {
            int num = Integer.parseInt ("XYZ"); //Exception Occur
            System.out.println (num);
        } catch (NumberFormatException e) {
            System.out.println ("Number format exception occurred");
        }
    }
}
