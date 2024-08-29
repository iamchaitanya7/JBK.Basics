package com.jbk.oops.polymorphism.assignments;

public class BankTest {
    public static void main (String[] args) {
        Bank b = new Bank ( );
        System.out.println ("Bank Rate of Interest : " + b.getRateOfInterest ( ) + "%");
        Bank b1 = new SBIBank ( );
        Bank b2 = new ICICIBank ( );
        Bank b3 = new AXISBank ( );
        System.out.println ("SBI Rate of Interest : " + b1.getRateOfInterest ( ) + "%");
        System.out.println ("ICICI Rate of Interest : " + b2.getRateOfInterest ( ) + "%");
        System.out.println ("AXIS Rate of Interest : " + b3.getRateOfInterest ( ) + "%");
    }
}