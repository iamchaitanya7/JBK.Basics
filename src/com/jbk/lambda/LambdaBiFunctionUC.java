package com.jbk.lambda;

import java.util.function.BiFunction;

public class LambdaBiFunctionUC {
    public static void main (String[] args) {
        //Using Predefined function.BiFunction Interface to Accept two user defined operands and perform desired operation.
        BiFunction<Integer, Integer, Integer> obj;

        obj = (a, b) -> (a + b);
        System.out.println ("Addition using Predefined function.BiFunction Interface: " + obj.apply (10, 20));

        //Trying to create Lambda Expression for a (Void Method without Parameters).
        Runnable obj1;
        obj1 = () -> System.out.println ("Hello");
        obj1.run ( );

        //Also try a functional interface with no parameters but has a return type.

    }
}
