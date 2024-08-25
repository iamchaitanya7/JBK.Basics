package com.jbk.oops.constructor;

public class Test_No_Parameter_and_Parameter_Constructor {
    public static void main (String[] args) {
        //11-August-2024-Task

        No_Parameter_and_Parameter_Constructor p1 = new No_Parameter_and_Parameter_Constructor ();
        No_Parameter_and_Parameter_Constructor p2 = new No_Parameter_and_Parameter_Constructor ( 101, "Book", 60.50 );

        System.out.println ( p1.id + " " + p1.name + " " + p1.price );
        System.out.println ( p2.id + " " + p2.name + " " + p2.price );

    }
}
