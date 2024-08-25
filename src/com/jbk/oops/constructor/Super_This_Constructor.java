package com.jbk.oops.constructor;

public class Super_This_Constructor {
    //11-August-2024-Task

    int x;
    int y;

    Super_This_Constructor () {
        super();                                            //Super() Constructor is used to call the Constructor from its Immediate Super/Base Class which is the (Object Class) , which is the root class of every object.
        System.out.println ( "No Args Constructor / Default Constructor" );
    }

    Super_This_Constructor (int x){
        super();                                         //Super() Constructor is used to call the Constructor from its Immediate Super/Base Class only, whether it is a (No Parameter Constructor) or (Parameter Constructor).
        this.x = x;
        System.out.println ( x + " " + y );
        System.out.println ( "Single Args Constructor" );
    }

    Super_This_Constructor (int x, int y){
        this();                                             //This() Constructor is used to call the Constructor from the Current Class only, whether it is a (No Parameter Constructor) or (Parameter Constructor).
        this.x = x;
        this.y = y;
        System.out.println ( x + " " + y );
        System.out.println ( "Two Args Constructor" );
    }
}
