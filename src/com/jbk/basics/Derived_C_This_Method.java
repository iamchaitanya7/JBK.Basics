package com.jbk.basics;

public class Derived_C_This_Method {
    public static void main (String[] args) {
        //08-August-2024-Task
        //Creating Object of Base Class and Calling it's only Last method which will call all the rest of Local Methods using This() keyword.
        Base_C_This_Method obj = new Base_C_This_Method ();
        obj.m6 (true);
        obj.init (10);
        obj.display ();

    }
}
