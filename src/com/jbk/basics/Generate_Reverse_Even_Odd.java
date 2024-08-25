package com.jbk.basics;

public class Generate_Reverse_Even_Odd {
    public static void main (String[] args) {
        //Generating Reverse Even No's from 100 to 1
        System.out.println("Reverse Even No's From 100-1 \n");
        for (int i = 100 ; i >= 1 ; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //Generating Reverse Odd No's from 100 to 1
        System.out.println("\nReverse Odd No's From 100-1 \n");
        for (int i = 100 ; i >= 1 ; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
