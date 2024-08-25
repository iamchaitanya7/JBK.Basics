package com.jbk.oops.abstraction;

public class Triangle_Abstract extends Shape_Abstract_C {
    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void calculateArea () {
        double breadth, height, area;
        breadth = 5;
        height =  12;
        area = 0.5 * (breadth * height);
        System.out.println ( area );
    }

    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void fillColorInShape () {
        System.out.println ( "Filling Color in Triangle" );
    }
}
