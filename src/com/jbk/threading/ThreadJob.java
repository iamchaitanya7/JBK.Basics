package com.jbk.threading;

import java.util.*;

public class ThreadJob extends Thread {

    int count = 0;

    //Overridden the run() method from the Thread Class.
    @Override
    public void run () {
        for (int i = 1; i <= 50000; i++) {
            //System.out.println (i);
            increment ( );
        }
    }

    synchronized void increment () {
        //synchronized (this){ }     Can also we used for more specified detailed making of a specific element as synchronized rather than making all stuff as synchronized.
        count += 1;

    }

}
