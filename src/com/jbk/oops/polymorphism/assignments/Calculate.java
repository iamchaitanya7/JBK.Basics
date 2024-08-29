package com.jbk.oops.polymorphism.assignments;

class Calculate {
    void sum (int d, int e) {
        System.out.println ("sum is " + (d + e));
    }

    void sum (double a, double b) {
        System.out.println ("sum is " + (a + b));
    }

    public static void main (String[] args) {
        Calculate cal = new Calculate ( );
        cal.sum (8, 5); // sum(int a, int b) is method is called.
        cal.sum (4.6, 3.8); // sum(float a, float b) is called.
    }
}
