package com.jbk.oops.polymorphism.assignments;

public class OverRide {

    public static void main (String[] args) {
        // method calling from sub class object
        DerivedClass der = new DerivedClass ( );
        der.method ( );

        // method calling from super class object
        BaseClass base = new BaseClass ( );
        base.method ( );
        BaseClass base1 = new DerivedClass ( );
        base1.method ( );
    }
}
