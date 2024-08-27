package com.jbk.exception_handling.assignments;

public class ArithmeticExceptionEx {
    public static void main (String[] args) {
        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;        //Divide by Zero Error will Occur.
            System.out.println ("Result = " + output);
        } catch (ArithmeticException e) {
            System.out.println ("Occurred Exception is: " + e);
            System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
        }
    }
}