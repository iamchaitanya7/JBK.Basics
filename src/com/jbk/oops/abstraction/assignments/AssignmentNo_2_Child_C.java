package com.jbk.oops.abstraction.assignments;

public class AssignmentNo_2_Child_C extends AssignmentNo_2_Base_C{
    int x, y, z;

    @Override
    void get(int a, int b){
        x = a;
        y = b;
    }

    @Override
    void add(){
        z = x + y;
    }

    @Override
    void display(){
        System.out.println ( "Addition is: " + z );
    }
}
