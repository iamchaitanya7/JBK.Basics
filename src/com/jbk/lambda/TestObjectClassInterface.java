package com.jbk.lambda;

public class TestObjectClassInterface {
    public static void main (String[] args) {
        ObjectClassInterface obj;
        obj = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println (i);
            }
        };
    }
}
