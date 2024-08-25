package com.jbk.oops.constructor;

public class No_Parameter_and_Parameter_Constructor {
    //11-August-2024-Task

    int id;
    String name;
    double price;

    public No_Parameter_and_Parameter_Constructor(){
        System.out.println ( "No Parameter Constructor" );
    }

    public No_Parameter_and_Parameter_Constructor(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
