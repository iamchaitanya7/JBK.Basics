package com.jbk.threading;

public class ThreadJob extends Thread {

    //Overridden the run() method from the Thread Class.
    @Override
    public void run () {
        for (int i = 1; i < 10; i++) {
            System.out.println (i);
        }
    }
}
