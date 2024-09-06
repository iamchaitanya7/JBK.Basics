package com.jbk.lambda;

public class TestLambdaA {
    public static void main (String[] args) {
        LambdaA lambdaA;        //reference of Interface (LambdaA)

        //Creating (Lambda Expression) for creating An Lambda Styled Method.
        /*
        The left side specifies any parameters required by the lambda expression.
        (If no parameters are needed, an empty parameter list is used.)
        On the right side is the lambda body, which specifies the actions of the lambda expression.
        The −> can be verbalized as “becomes” or “goes to.”
        */
        lambdaA = (a, b) -> (a + b);

        int resultA = lambdaA.m1 (10, 20);
        System.out.println ( );
    }
}
