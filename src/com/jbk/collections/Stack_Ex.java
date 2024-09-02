package com.jbk.collections;

import java.util.Stack;

public class Stack_Ex {
    void lineSeparator () {
        System.out.println ("====================================================");
    }

    public static void main (String[] args) {
        Stack_Ex line = new Stack_Ex ( );

        Stack<Integer> integerStack = new Stack<> ( );

        integerStack.add (10);
        integerStack.add (20);
        integerStack.add (30);
        integerStack.add (40);
        integerStack.add (50);
        integerStack.add (60);

        //System.out.println (integerStack.get (5) );

        line.lineSeparator ( );
        //Displaying of the elements of the Stack using for-each.
        System.out.println ("Initial Stack Elements: ");
        integerStack.forEach (Integer -> System.out.println (Integer));
        line.lineSeparator ( );

        System.out.println ("Pushing a Element on Top of Stack: " + integerStack.push (70));

        line.lineSeparator ( );
        //Update Stack elements are Displayed.
        System.out.println ("Updated Stack Elements After Pushing: ");
        integerStack.forEach (Integer -> System.out.println (Integer));
        line.lineSeparator ( );


        System.out.println ("Pop a Element from Top of Stack: " + integerStack.pop ( ));      //LIFO is performed here.

        line.lineSeparator ( );
        //Updated Stack elements are Displayed.
        System.out.println ("Updated Stack Elements: ");
        integerStack.forEach (Integer -> System.out.println (Integer));
        line.lineSeparator ( );



    }
}
