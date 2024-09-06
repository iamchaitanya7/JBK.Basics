package com.jbk.lambda;

//An Interface that contains only one method which cant also we overloaded by any chance.
@FunctionalInterface
public interface LambdaA {
    //Single Instance Method one and only method based (Functional Interface).
    int m1 (int a, int b);

    //Cannot Overload the methods or have multiple methods in the functional interface.
    //int m1(int a, int b, int c);
}