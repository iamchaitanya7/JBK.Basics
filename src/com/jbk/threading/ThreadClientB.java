package com.jbk.threading;

public class ThreadClientB {
    public static void main (String[] args) throws InterruptedException {
        ThreadJobB jobB = new ThreadJobB ( );

        Thread t1 = new Thread (jobB);
        Thread t2 = new Thread (jobB);

        t1.setName ("First Thread");
        t2.setName ("Second Thread");

        t1.start ( );
        t2.start ( );

        System.out.println ("Exit from Main....");

    }
}
