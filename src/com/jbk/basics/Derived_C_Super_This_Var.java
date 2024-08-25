package com.jbk.basics;

public class Derived_C_Super_This_Var extends Base_C_Super_This_Var{
    int a = 10;  //Instance Variable which can be accessed using (this.variable_name) keyword.
    void m1(){
        int a = 7;  //Local Variable which can be accessed using (just variable_name).
        System.out.println ( a );
        System.out.println ( this.a );
        System.out.println ( super.a ); //Instance Variable of Immediate Super/Base Class can be accessed using (super.variable_name) keyword.
    }
}
