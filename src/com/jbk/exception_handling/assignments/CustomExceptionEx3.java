package com.jbk.exception_handling.assignments;

public class CustomExceptionEx3 {
    public static void main (String[] args) throws Exception {
        CustomExceptionEx3 es = new CustomExceptionEx3 ( );
        es.displayMSG ( );
    }

    public void displayMSG () throws CustomExceptionEx1 {
        for (int j = 8; j > 0; j--) {
            System.out.println ("j= " + j);
            if (j == 7) {
                throw new CustomExceptionEx1 ("This is my own Custom Exception Message");
            }
        }
    }
}