package com.jbk.lambda;

public class TestAreaInterface {
    public static void main (String[] args) {
        //WAP to calculate the Area of Circle.
        AreaInterface obj;
        //Using the inbuilt (Math Class) methods to calculate area.
        obj = (radius) -> Math.PI * Math.pow (radius, 2);
        System.out.println ("Area of Circle: " + obj.calculateArea (5));

        //WAP to calculate the Area of Square
        AreaInterface obj1 = (side) -> Math.pow (side, 2);         // or (size * size);
        System.out.println ("Area of Square: " + obj1.calculateArea (10));
    }
}
