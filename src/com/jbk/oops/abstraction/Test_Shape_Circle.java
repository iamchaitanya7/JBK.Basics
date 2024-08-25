package com.jbk.oops.abstraction;

public class Test_Shape_Circle {
    void seperator(){
        System.out.println ( "===================================================" );
    }

    public static void main (String[] args) {
        Test_Shape_Circle sep = new Test_Shape_Circle ();
        Circle_Abstract_C obj = new Circle_Abstract_C ();
        obj.calculateArea ();
        obj.fillColorInShape ();
        sep.seperator ();

        Square_Abstract obj1 = new Square_Abstract ();
        obj1.calculateArea ();
        obj1.fillColorInShape ();
        sep.seperator ();

        Triangle_Abstract obj2 = new Triangle_Abstract ();
        obj2.calculateArea ();
        obj2.fillColorInShape ();
        sep.seperator ();
    }
}
