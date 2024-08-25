package com.jbk.oops.inheritance;

public class B1_Simple_Inheritance extends A1_Simple_Inheritance{
    String modelType;

    public void showDetails(){
        vehicleType = "Car";
        modelType = "Tesla";
        System.out.println ( vehicleType + " " + modelType );
    }
}
