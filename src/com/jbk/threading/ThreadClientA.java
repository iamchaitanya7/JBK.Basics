package com.jbk.threading;

public class ThreadClientA {
    public static void main (String[] args) throws InterruptedException {
        ThreadJobA jobA = new ThreadJobA ( );

        Thread t1 = new Thread (jobA);
        Thread t2 = new Thread (jobA);
        Thread t3 = new Thread (jobA);

        t1.start ( );
        t2.start ( );
        t3.start ( );

        /*t1.join ();
        t2.join ();
        t3.join ();*/

        System.out.println ("Exit from Main....");

    }
}
