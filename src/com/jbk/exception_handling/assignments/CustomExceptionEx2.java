package com.jbk.exception_handling.assignments;

public class CustomExceptionEx2 {
    public static void main (String[] args) {
        try {
            throw new CustomExceptionEx1 ("Custom");
            // I'm throwing user defined custom exception above
        } catch (CustomExceptionEx1 exp) {
            System.out.println ("Hi this is my catch block");
            System.out.println (exp);
        }
    }
}
