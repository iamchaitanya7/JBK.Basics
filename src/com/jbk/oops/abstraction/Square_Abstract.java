package com.jbk.oops.abstraction;

public class Square_Abstract extends Shape_Abstract_C {
    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void calculateArea () {
        double side, area;
        side = 5;
        area = (side * side);
        System.out.println ( area );
    }

    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void fillColorInShape () {
        System.out.println ( "Filling Color in Square" );
    }
}
