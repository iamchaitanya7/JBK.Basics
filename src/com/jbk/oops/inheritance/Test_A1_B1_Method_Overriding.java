package com.jbk.oops.inheritance;

public class Test_A1_B1_Method_Overriding {
    //Demonstrating Method Overriding of [toString()] Method of [Object Class] which is Overrided by [Child Class toString()] Method.
    public static void main (String[] args) {
        A1_Method_Overriding obj = new A1_Method_Overriding(22, "Book", 500.50);
        System.out.println ( obj );
    }
}
