package com.jbk.oops.abstraction;

public abstract class A_Abstract_Ex {
    public static final int a;

    static {
        a = 10;
    }

    //Abstract Method with Same Class Name.
    abstract void A_Abstract_Ex ();
    abstract void A_Abstract_Ex (int a);

    //Concrete Method with Same Class Name.
    void A_Abstract_Ex (String name){
        System.out.printf ("Abstract Class Concrete Method");
    }
    //So Abstract Method can be Overloaded using Abstract/Concrete Method also.

}