package com.jbk.oops.inheritance;

public class A1_Method_Overriding {
    int id;
    String name;
    double price;

    public A1_Method_Overriding (int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        String str = id + " " + name + " " + price;
        return str;
        //return super.toString () + str;
    }
}
