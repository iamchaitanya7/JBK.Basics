package com.jbk.oops.abstraction.assignments;

public class Test_AssignmentNo_5 implements AssignmentNo_5_Interface_B {
    @Override
    public void method1 () {
        System.out.println ( "Implemented Method-1" );
    }
    @Override
    public void method2 () {
        System.out.println ( "Implemented Method-2" );
    }

    public static void main (String[] args) {
        Test_AssignmentNo_5 obj = new Test_AssignmentNo_5 ();
        obj.method1 ();
        obj.method2 ();
    }
}
