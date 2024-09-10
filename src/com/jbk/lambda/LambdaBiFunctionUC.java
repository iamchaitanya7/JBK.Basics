package com.jbk.lambda;

import java.util.function.BiFunction;

public class LambdaBiFunctionUC {
    public static void main (String[] args) {
        //Using Predefined function.BiFunction Interface to Accept two user defined operands and perform desired operation.
        BiFunction<Integer, Integer, Integer> obj;

        obj = (a, b) -> (a + b);
        System.out.println ("Addition using Predefined function.BiFunction Interface: " + obj.apply (10, 20));

        //Trying to create Lambda Expression for a (Void Method without Parameters) using the Runnable Interface (Run) Method.
        Runnable obj1;
        obj1 = () -> System.out.println ("Hello");
        obj1.run ( );

        //Trying to implement the Lambda Expression (Block of Code) using the Runnable Interface (Run) Method
        Runnable obj2 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println (i);
            }
        };
        obj2.run ( );

        //Functional Interface with (No Parameters but has a Return[int, double, string, long, etc]) type.
        /*ReturnTypeNoParameterInterface obj3 = () -> {
            int c = 10 + 20;
            return c;
        };
        System.out.println ("Addition is: " + obj3);*/

    }
}
