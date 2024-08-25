package com.jbk.oops.abstraction.assignments;

public class AssignmentNo_1_Child_C extends AssignmentNo_1_Base_C{
    @Override
    public void display1 () {
        System.out.println ( "Overriding the Abstract Method ");
    }


    public static void main (String[] args) {
        AssignmentNo_1_Child_C obj = new AssignmentNo_1_Child_C ();
        obj.display ();
        obj.display1 ();
    }
}
