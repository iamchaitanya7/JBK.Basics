package com.jbk.basics;

public class Instance_Local_Var {
    int x = 5;  //Instance Variable

    void m1(){
        int x = 30;  //Local Variable
        System.out.println ( x );           //Calling of Local Variable by directly calling it.
        System.out.println ( this.x );      // Calling of Instance Variable using (this.variable_name) keyword.
    }

    public static void main (String[] args) {
        Instance_Local_Var m = new Instance_Local_Var ();
        m.m1 ();
    }
}
