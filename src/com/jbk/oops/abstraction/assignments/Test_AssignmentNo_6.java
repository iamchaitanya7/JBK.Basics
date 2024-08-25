package com.jbk.oops.abstraction.assignments;

public class Test_AssignmentNo_6 implements AssignmentNo_6_Interface_A{
    @Override
    public void move () {
        System.out.println ( "Average Speed: " +avgSpeed );
    }

    public static void main (String[] args) {
        Test_AssignmentNo_6 obj = new Test_AssignmentNo_6 ();
        obj.move ();
    }
}
