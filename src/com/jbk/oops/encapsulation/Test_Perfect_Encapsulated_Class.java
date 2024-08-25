package com.jbk.oops.encapsulation;

public class Test_Perfect_Encapsulated_Class {
    public static void main (String[] args) {
        Perfect_Encapsulated_Class obj = new Perfect_Encapsulated_Class (101, "Book", 500.50);
        obj.setPid (-102); //Trying to Change the value of pid variable through setPid() method but will not reflect because it's a negative value, and we had a rule configuration in method.
        System.out.println ( obj.getPid () + " " + obj.getName () + " " + obj.getPrice ());
    }
}
