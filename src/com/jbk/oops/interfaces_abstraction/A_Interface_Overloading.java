package com.jbk.oops.interfaces_abstraction;

public interface A_Interface_Overloading {
    //Interfaces Abstract Method Overloading.
    void A_Interface_Overloading();
    void A_Interface_Overloading(int a, int b);

    //Nested Interfaces.
    interface B_Interface_Nesting {
        //void A_Interface_Overloading();
        void B_Interface_Nesting();
    }
}