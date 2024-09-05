package com.jbk.threading;

public class ThreadClient {
    void separator () {
        System.out.println ("=========================================================");
    }

    public static void main (String[] args) throws InterruptedException {
        ThreadClient line = new ThreadClient ( );

        System.out.println ("Thread Example....!");
        ThreadJob job = new ThreadJob ( );
        line.separator ( );

        //The below start() method is used to start the specified thread (class).
        //job.start ( );
        Thread t1 = new Thread (job);
        Thread t2 = new Thread (job);
        Thread t3 = new Thread (job);

        t1.start ( );
        t2.start ( );
        t3.start ( );

        t1.join ( );
        t2.join ( );
        t3.join ( );

        System.out.println (job.count);
        System.out.println ("Exit from Main....");

    }
}
