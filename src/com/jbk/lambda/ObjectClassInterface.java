package com.jbk.lambda;

public interface ObjectClassInterface {
    @FunctionalInterface
    interface MyFunction {
        void perform ();

        boolean equals (Object obj);  // Inherited from Object class
    }
}
