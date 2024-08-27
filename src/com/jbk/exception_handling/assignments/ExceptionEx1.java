package com.jbk.exception_handling.assignments;

public class ExceptionEx1 {
    public static void main (String[] args) {
        int[] array = {1, 2};
        try {
            System.out.println ("The 10th value of Array is : " + array[10]);
        } catch (Exception e) {
            System.out.println ("The Exception/Error Occurred is: " + e);
        }
    }
}