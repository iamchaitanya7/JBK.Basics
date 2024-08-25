package com.jbk.oops.inheritance;

public class B_Method_Overriding extends A_Method_Overriding{
    //13-08-2024-Task
    B_Method_Overriding(){
        System.out.println ( "B Constructor" );
    }

    @Override
    void m1() {                     //Overrided Method
        System.out.println ("B Method");
    }
}
