package com.jbk.oops.inheritance.assignments;

public class AssignmentNo_2_Child extends AssignmentNo_2_Base{
    String modelType;

    public void showDetail(){
        vehicleType = "Car";
        modelType = "Toyota";
        System.out.printf (vehicleType + " " + modelType);
    }

    public static void main (String[] args) {
        AssignmentNo_2_Child obj = new AssignmentNo_2_Child ();
        obj.showDetail ();
    }
}
