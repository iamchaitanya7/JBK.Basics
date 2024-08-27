package com.jbk.exception_handling.assignments;

public class MultiCatchBlocksEx {
    public static void main (String[] args) {
        try {
            int[] a = new int[7];
            a[4] = 30 / 0;  //Numeric overflow in expression Error;
            System.out.println ("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println ("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println ("Warning: Some Other exception");
        }
        System.out.println ("Out of try-catch block...");
    }
}
