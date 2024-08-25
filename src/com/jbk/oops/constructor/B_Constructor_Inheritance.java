package com.jbk.oops.constructor;

public class B_Constructor_Inheritance {
    B_Constructor_Inheritance(){
        super();                //Super() Constructor giving the Constructor Call to it's immediate Super/Base Class's (No Parameter Constructor) that is (A_Constructor_Inheritance) Class.
        //super(10,20);         //Using Parametrized Super(int a, int b,...,int n) Constructor We can Catch or Call the (Parametrized Constructor) of it's Immediate Super Class or Base Class.
        System.out.println ("B Constructor");
    }
}
