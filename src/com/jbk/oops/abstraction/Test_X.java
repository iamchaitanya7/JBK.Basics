package com.jbk.oops.abstraction;

public class Test_X {
    public static void main (String[] args) {
        X obj = new X ();
        obj.m1 (new Circle_Abstract_C () );
        obj.m1 (new Square_Abstract () );
        obj.m1 (new Triangle_Abstract () );
    }
}
