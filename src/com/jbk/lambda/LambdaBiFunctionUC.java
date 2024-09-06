package com.jbk.lambda;

import java.util.function.BiFunction;

public class LambdaBiFunctionUC {
    public static void main (String[] args) {
        //Using Predefined function.BiFunction Interface to Accept two user defined operands and perform desired operation.
        BiFunction<Integer, Integer, Integer> obj;

        obj = (a, b) -> (a + b);
        System.out.println ("Addition using Predefined function.BiFunction Interface: " + obj.apply (10, 20));
    }
}
