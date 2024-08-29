package com.jbk.oops.polymorphism.assignments;

class BindSubclass2 extends BindSubclass1 {
    void display () {
        super.display ( );
        text = "SubClass2's";
        System.out.println (text + " function called");
    }
}