package com.jbk.oops.constructor;

public class A_Constructor_Inheritance {
    //10-August-2024-Task

    int a;           //Instance Variables
    int b;

    A_Constructor_Inheritance (){                //No Parameter Constructor
        super();
        System.out.println ( a + " " + b);      //Values of (Instance Variables) are Displayed as in the Constructor (No Local Variables) are available.
    }

    A_Constructor_Inheritance(int a){            //Single Parameter Constructor
        this.a = a;                              //(Instance Variables) are assigned values using Values Captured from (Constructor's Local Variables).
    }

    A_Constructor_Inheritance(int a, int b){    //Double Parameter Constructor
        this.a = a;                             //(Instance Variables) are assigned values using Values Captured from (Constructor's Local Variables).
        this.b = b;
    }
}
