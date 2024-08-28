package com.jbk.oops.polymorphism.assignments;

class BindDynamicSubClass extends BindDynamic {

    void display (String str) {
        if (val == null) {
            str = "Derived Class Fuction ".concat (str);
            System.out.println (str);
        }
    }
}

