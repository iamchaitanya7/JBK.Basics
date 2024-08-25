package com.jbk.oops.interfaces_abstraction;

public class C_Interface_Abstract implements A_Interface_Abstract, B_Interface_Abstract {
    //Inherited the (Interfaces) which are acting as a Multiple Base Interfaces as (A, B) into their (Child Class) as (C)


    //Overriding the m1() method of the (Both Base Interfaces/Classes) into the (Child Class);
    @Override
    public void m1 () {
        System.out.println ( "Example if Implementation of Multiple Inheritance using Interfaces and Abstraction" );
    }

}
