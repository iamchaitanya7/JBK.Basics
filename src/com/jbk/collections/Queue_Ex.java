package com.jbk.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {
    public static void main (String[] args) {
        ArrayDeque<Integer> integerQueue = new ArrayDeque<> ( );
        integerQueue.add (10);
        integerQueue.add (20);
        integerQueue.add (30);
        integerQueue.add (40);
        integerQueue.add (50);
        integerQueue.add (60);

        System.out.println (integerQueue.poll ( ));         //FIFO is Performed here.

        System.out.println (integerQueue.peek ( ));         //Just Retrives the First element is from Queue.


    }
}
