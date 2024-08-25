package com.jbk.oops.abstraction;

public  class Circle_Abstract_C extends Shape_Abstract_C{
    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void calculateArea () {
        double radius, area;
        radius = 5;
        area = Math.PI * (radius * radius);
        System.out.println ( area );
    }

    //Demonstration of Abstract Method Overriding from Which is declared as Abstract in the Base Abstract Class;
    @Override
    void fillColorInShape () {
        System.out.println ( "Filling Color in Circle" );
    }
}
