package com.jbk.exception_handling.assignments;

class ThrowEx2Test {

    public static void main (String[] args) {
        try {
            ThrowEx2 obj = new ThrowEx2 ( );
            obj.mymethod (1);
        } catch (Exception ex) {
            System.out.println (ex);
        }
    }
}
