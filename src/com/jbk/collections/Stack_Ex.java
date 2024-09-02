package com.jbk.collections;

import java.util.Stack;

public class Stack_Ex {
    public static void main (String[] args) {
        Stack<Integer> integerStack = new Stack<> ( );

        integerStack.add (10);
        integerStack.add (20);
        integerStack.add (30);
        integerStack.add (40);
        integerStack.add (50);
        integerStack.add (60);


        integerStack.forEach (Integer -> System.out.println (Integer));

    }
}
