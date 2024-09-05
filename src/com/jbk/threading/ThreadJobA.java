package com.jbk.threading;

public class ThreadJobA implements Runnable {
    @Override
    public void run () {
        System.out.println ("Hello....");

        for (int i = 1; i <= 10; i++) {
            System.out.println (i);
            try {
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
        }
    }
}
