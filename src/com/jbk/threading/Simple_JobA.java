package com.jbk.threading;

//JobA to print Greet 20 times.

public class Simple_JobA {
    void m1 () {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println ("Greet");
            }
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }
}