package com.jbk.oops.inheritance.assignments;

public class AssignmentNo_1_Child extends AssignmentNo_1_Base {
    public void methodB(){
        System.out.printf ("\nChild Class Method");
    }

    public static void main (String[] args) {
        AssignmentNo_1_Child obj = new AssignmentNo_1_Child ();
        obj.methodA ();
        obj.methodB ();
    }
}
