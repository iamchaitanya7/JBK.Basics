package com.jbk.oops.polymorphism.assignments;

class BindDynSubClass extends BindDynamic {
    void display (String str) {
        super.display (str);
        if (val == null) {
            str = "Derived Class Fuction ".concat (str);
            System.out.println (str);
        }
    }
}