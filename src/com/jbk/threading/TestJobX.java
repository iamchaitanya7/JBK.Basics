package com.jbk.threading;

public class TestJobX {
    public static void main (String[] args) {
        SimpleJobX j1 = new SimpleJobX ( );

        Thread t1 = new Thread (j1);
        Thread t2 = new Thread (j1);
        Thread t3 = new Thread (j1);
        Thread t4 = new Thread (j1);
        Thread t5 = new Thread (j1);

        t1.setName ("Chintu T1: ");
        t2.setName ("Pintu T2: ");
        t3.setName ("Montu T3: ");
        t4.setName ("Chota Bheem T4: ");
        t5.setName ("Shinchan T5: ");

        t1.start ( );
        t2.start ( );
        t3.start ( );
        t4.start ( );
        t5.start ( );

    }
}
