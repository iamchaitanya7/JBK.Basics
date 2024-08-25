package com.jbk.oops.constructor;

public class Constructor_Chaining {
    //Demostration of Constructor Chaining and trying to do (Recursive Constructor Invocation).

    Constructor_Chaining(int a){
        //this(true);                  //This Statement Would Lead to Recursive Constructor Invocation.
        System.out.println ( "Integer Method" );
    }
    Constructor_Chaining(float b){
        this(10);
        System.out.println ( "Float Method" );
    }
    Constructor_Chaining(String c){
        this(3.14f);
        System.out.println ( "String Method" );
    }
    Constructor_Chaining(double d){
        this("Hello");
        System.out.println ( "Double Method" );
    }
    Constructor_Chaining(char e){
        this(11.1);
        System.out.println ( "Char Method" );
    }
    Constructor_Chaining(boolean f){
        this('*');
        System.out.println ( "Boolean Method" );
    }
}