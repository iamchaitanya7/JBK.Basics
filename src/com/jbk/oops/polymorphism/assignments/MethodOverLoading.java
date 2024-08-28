package com.jbk.oops.polymorphism.assignments;

public class MethodOverLoading {
    public static void main (String[] args) {
        OverLoad Obj = new OverLoad ( );
        double result;
        int add;
        Obj.demo (10);
        Obj.demo (10, 20);
        result = Obj.demo (5.5);
        System.out.println ("O/P : " + result);
        add = Obj.demo (5, 5, 5);
        System.out.println ("O/P : " + add);
    }
}
