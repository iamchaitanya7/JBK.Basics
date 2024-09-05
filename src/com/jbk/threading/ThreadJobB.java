package com.jbk.threading;

public class ThreadJobB implements Runnable {
    @Override
    public void run () {
        System.out.println ("Hello....");

        for (int i = 1; i < 10; i++) {
            System.out.println (Thread.currentThread ( ).getName ( ) + " : " + i);
        }
    }
}
