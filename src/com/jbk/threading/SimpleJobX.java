package com.jbk.threading;

public class SimpleJobX extends Thread {

    int count = 0;

    @Override
    public void run () {
        ++count;
        for (int i = 0; i <= 10; ++i) {
            System.out.println (Thread.currentThread ( ).getName ( ) + i);

            try {
                sleep (1000);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
        }
    }
}
