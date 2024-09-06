package com.jbk.lambda;

import java.util.ArrayList;

public class ArrayListLambdaUC {
    void separator () {
        System.out.println ("===================================================");
    }

    public static void main (String[] args) {
        ArrayListLambdaUC line = new ArrayListLambdaUC ( );

        ArrayList<String> stringArrayList = new ArrayList<> ( );
        stringArrayList.add ("Hello");
        stringArrayList.add ("Bye");
        stringArrayList.add ("Hi");
        stringArrayList.add ("World");
        stringArrayList.add ("Java");

        //Using Normal For-Each Loop.
        line.separator ( );
        System.out.println ("Normal For-Each Loop");
        line.separator ( );
        for (String str : stringArrayList) {
            System.out.println (str.toUpperCase ( ) + " " + str.toLowerCase ( ) + " " + str);
        }
        line.separator ( );

        //Using For-Each Loop using the Lambda Expression.
        System.out.println ("For-Each Loop Using Lambda Expression");
        line.separator ( );
        stringArrayList.forEach (str1 -> System.out.println (str1.toUpperCase ( ) + " " + str1.toLowerCase ( ) + " " + str1));
        line.separator ( );
    }
}
