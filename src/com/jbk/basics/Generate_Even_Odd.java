package com.jbk.basics;

public class Generate_Even_Odd {
    public static void main (String[] args) {
        //Generating Even No's from 1 to 100
        System.out.println("\nEven No's From 1-100 \n");
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //Generating Odd No's from 1 to 100
        System.out.println("\nOdd No's From 1-100 \n");
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
