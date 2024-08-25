package com.jbk.oops.abstraction;

import java.awt.*;

public class Test_Shape_Circle_Squ_Triang {
    void seperator(){
        System.out.println ( "===================================================" );
    }

    public static void main (String[] args) {
        Test_Shape_Circle sep = new Test_Shape_Circle ();

        //Shape_Abstract_C obj = new Shape_Abstract_C ();       //We Cannot Create Object of Abstract Class;

        Shape_Abstract_C obj;
        obj  = new Circle_Abstract_C ();
        obj.calculateArea ();
        obj.fillColorInShape ();
        sep.seperator ();

        obj  = new Square_Abstract ();
        obj.calculateArea ();
        obj.fillColorInShape ();
        sep.seperator ();

        obj  = new Triangle_Abstract ();
        obj.calculateArea ();
        obj.fillColorInShape ();
        sep.seperator ();
    }
}
