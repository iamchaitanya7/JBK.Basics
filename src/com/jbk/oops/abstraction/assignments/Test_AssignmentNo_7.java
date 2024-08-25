package com.jbk.oops.abstraction.assignments;

public class Test_AssignmentNo_7 implements AssignmentNo_7_Interface_A, AssignmentNo_7_Interface_B{

    @Override
    public boolean isMoveable () {
        return true;
    }

    @Override
    public boolean isRollable () {
        return true;
    }

    public static void main (String[] args) {
        Test_AssignmentNo_7 obj = new Test_AssignmentNo_7 ();
        System.out.println (obj.isMoveable ());
        System.out.println (obj.isRollable ());
    }
}
