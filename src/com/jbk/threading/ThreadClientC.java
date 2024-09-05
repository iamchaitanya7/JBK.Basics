package com.jbk.threading;

public class ThreadClientC {
    public static void main (String[] args) {
        ThreadJobC jobC = new ThreadJobC ( );

        Thread t1 = new Thread (jobC);
        t1.start ( );
    }
}
