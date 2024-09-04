package com.jbk.threading;

//JobC printing Metro till JVM Ends.

public class SimpleJobC {
    void m3 () {
        try {
            while (true) {
                System.out.println ("Metro");
                Thread.sleep (1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }

        /*for (int i = 0; i < ; i++) {
            System.out.println ("Metro: " +i );

        }*/
    }
}
