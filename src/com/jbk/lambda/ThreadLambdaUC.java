package com.jbk.lambda;

import com.jbk.threading.ThreadJobC;

public class ThreadLambdaUC {
    public static void main (String[] args) {

        new Thread (new Runnable ( ) {
            @Override
            public void run () {
                for (int i = 0; i < 10; i++) {
                    System.out.println (i);
                }
            }
        }).start ( );
    }
}

