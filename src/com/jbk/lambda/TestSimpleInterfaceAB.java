package com.jbk.lambda;

public class TestSimpleInterfaceAB {
    public static void main (String[] args) {
        SimpleInterfaceA simpleInterfaceA = new SimpleInterfaceA ( );
        SimpleInterfaceB simpleInterfaceB = new SimpleInterfaceB ( );

        int resultA = simpleInterfaceA.m1 (10, 20);
        int resultB = simpleInterfaceB.m1 (10, 5);

        System.out.println ("Result of Class A: " + resultA);
        System.out.println ("Result of Class B: " + resultB);
    }
}
