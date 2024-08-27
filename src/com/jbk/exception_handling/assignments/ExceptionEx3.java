package com.jbk.exception_handling.assignments;

class ExceptionEx3 {
    static int sum (int num1, int num2) {
        if (num1 == 0) {
            throw new ArithmeticException ("First parameter is not valid");
        } else {
            System.out.println ("Both parameters are correct!!");
            return num1 + num2;
        }
    }

    public static void main (String[] args) {
        int res = sum (0, 12);
        System.out.println (res);
        System.out.println ("Continue Next statements");
    }
}
