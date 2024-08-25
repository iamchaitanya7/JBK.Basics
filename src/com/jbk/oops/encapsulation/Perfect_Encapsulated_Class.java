package com.jbk.oops.encapsulation;

public class Perfect_Encapsulated_Class {
    int pid;
    String name;
    double price;

    //Creating a Parameterized Constructor of Class
    public Perfect_Encapsulated_Class (int pid, String name, double price) {
        this.pid = pid;            //Assigning Values to the (Instance Variables) using the values Captured in the (Local Variables) while the Constructor call.
        this.name = name;
        this.price = price;
    }

    //Getter Method for pid Variable
    public int getPid () {
        return pid;             //Returning of the Pid value or Using this method to Display the pid value.
    }

    //Setter Method for pid Variable; With User Defined Rule Configuration or Condition Checking...!
    public void setPid (int pid) {
        if(pid > 0)             //Rule Configuration for Setting/Changing the pid value.
            this.pid = pid;
    }

    //Getter Method for Name Variable
    public String getName () {
        return name;            //Returning of the Name value or Using this method to Display the Name value
    }

    //Setter Method for Name Variable; With User Defined Rule Configuration or Condition Checking...!
    public void setName (String name) {
        this.name = name;
    }

    //Getter Method for Price Variable
    public double getPrice () {
        return price;           //Returning of the Price value or Using this method to Display the Price value
    }

    //Setter Method for Price Variable; With User Defined Rule Configuration or Condition Checking...!
    public void setPrice (double price) {
        if (price > 0)          //Rule Configuration for Setting/Changing the Price value.
            this.price = price;
    }
}