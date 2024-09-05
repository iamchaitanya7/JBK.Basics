package com.jbk.threading;

import javax.sound.midi.Soundbank;

public class ThreadClientC {
    public static void main (String[] args) throws InterruptedException {
        ThreadJobC jobC = new ThreadJobC ( );

        Thread t1 = new Thread (jobC);
        System.out.println ("State of the Thread : " + t1.getState ( ));    //NEW State of the Thread
        t1.start ( );
        System.out.println ("State of the Thread : " + t1.getState ( ));    //RUNNABLE State of the Thread.
        t1.join ( );
        System.out.println ("State of the Thread : " + t1.getState ( ));   //TERMINATED State of the Thread.

        t1.setDaemon (true);         //Setting the NormalThread as Daemon Thread.

    }
}
