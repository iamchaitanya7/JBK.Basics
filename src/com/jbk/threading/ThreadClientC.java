package com.jbk.threading;

import javax.sound.midi.Soundbank;

public class ThreadClientC {
    public static void main (String[] args) throws InterruptedException {
        ThreadJobC jobC = new ThreadJobC ( );

        Thread t1 = new Thread (jobC);
        System.out.println ("ID of Thread: " + t1.getId ( ));                //Displays ID of the Specified Thread.
        System.out.println ("Name of Thread: " + t1.getName ( ));            //Displays Name of the Specified Thread.
        System.out.println ("Check Whether a Thread is Alive or Not: " + t1.isAlive ( ));

        System.out.println ("State of the Thread : " + t1.getState ( ));    //NEW State of the Thread.

        t1.start ( );
        System.out.println ("Check Whether a Thread is Alive or Not: " + t1.isAlive ( ));
        System.out.println ("State of the Thread : " + t1.getState ( ));    //RUNNABLE State of the Thread.

        t1.join ( );
        System.out.println ("State of the Thread : " + t1.getState ( ));   //TERMINATED State of the Thread.
        System.out.println ("Current Active Count of Thread:  " + Thread.activeCount ( ));                             //Displays the Count of Current Active Threads.

        t1.setDaemon (true);         //Setting the NormalThread as Daemon Thread.
        System.out.println ("Checking Whether a Thread is Daemon or Not: " + t1.isDaemon ( ));
    }
}
