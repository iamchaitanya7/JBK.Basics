package com.jbk.exception_handling.assignments;

public class OwnExceptionMain {
    public static void intFn () throws OwnException {
        System.out.println ("Throwing OwnException from intFn()");
        throw new OwnException (10);
    }

    public static void floatFn () throws OwnException {
        System.out.println ("Throwing OwnException from floatFn()");
        throw new OwnException ((float) 111.111);
    }

    public static void charFn () throws OwnException {
        System.out.println ("Throwing OwnException from charFn()");
        throw new OwnException ('A');
    }

    public static void StringFn () throws OwnException {
        System.out.println ("Throwing OwnException from StringFn()");
        throw new OwnException ("Java World..");
    }

    public static void main (String[] args) {
        try {
            intFn ( );
        } catch (OwnException e) {
            e.printStackTrace ( );
        }
        try {
            floatFn ( );
        } catch (OwnException e) {
            e.printStackTrace ( );
        }
        try {
            charFn ( );
        } catch (OwnException e) {
            e.printStackTrace ( );
        }
        try {
            StringFn ( );
        } catch (OwnException e) {
            e.printStackTrace ( );
        }
    }
}
