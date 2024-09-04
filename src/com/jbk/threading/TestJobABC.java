package com.jbk.threading;

import org.junit.jupiter.api.DisplayNameGenerator;

public class TestJobABC {
    public static void main (String[] args) {
        Simple_JobA a = new Simple_JobA ( );
        Simple_JobB b = new Simple_JobB ( );
        SimpleJobC c = new SimpleJobC ( );

        c.m3 ( );
        a.m1 ( );
        b.m2 ( );
    }
}
