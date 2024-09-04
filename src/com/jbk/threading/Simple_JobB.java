package com.jbk.threading;

//JobB for Printing the 1 to 10.

public class Simple_JobB {
    void m2 () {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println (i);
            }
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }
}
