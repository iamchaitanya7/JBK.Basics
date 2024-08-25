package com.jbk.oops.abstraction.assignments;

public class Test_AssignmentNo_4 implements AssignmentNo_4_Interface_A, AssignmentNo_4_Interface_B {
    @Override
    public void myMethod () {
        System.out.println ( "Multiple Inheritance Example using Interfaces" );
    }

    public static void main (String[] args) {
        Test_AssignmentNo_4 obj = new Test_AssignmentNo_4 ();
        obj.myMethod ();
    }
}
