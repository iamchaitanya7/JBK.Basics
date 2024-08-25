package com.jbk.oops.abstraction;

public class Test_A_B_Abstract_Ex {
    public static void main (String[] args) {
        B_Abstract_Ex obj = new B_Abstract_Ex ();
        obj.A_Abstract_Ex ();
        obj.A_Abstract_Ex (11);
        obj.A_Abstract_Ex ( "Chaitanya" );
        System.out.println (B_Abstract_Ex.a );
    }
}
