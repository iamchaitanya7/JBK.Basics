package com.jbk.exception_handling.assignments;

public class OwnException extends Exception {
    public OwnException (int msg) {
        super (String.valueOf (msg));
    }

    public OwnException (float msg) {
        super (String.valueOf (msg));
    }

    public OwnException (char msg) {
        super (String.valueOf (msg));
    }

    public OwnException (String msg) {
        super (msg);
    }
}
