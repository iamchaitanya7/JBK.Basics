package com.jbk.threading;

public class ThreadClient {
    void separator () {
        System.out.println ("=========================================================");
    }

    public static void main (String[] args) {
        ThreadClient line = new ThreadClient ( );
        System.out.println ("Thread Example....!");
        ThreadJob job = new ThreadJob ( );
        //The below start() method is used to start the specified thread (class).
        job.start ( );


        line.separator ( );

    }
}
