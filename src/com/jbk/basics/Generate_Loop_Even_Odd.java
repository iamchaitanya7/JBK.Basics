package com.jbk.basics;

public class Generate_Loop_Even_Odd {
    public static void main (String[] args) {
        //Generating Even No's Using (For) Loop from 1 to 100
        System.out.println("Even No's From 1-100 Using For Loop\n");
        for (int i = 2 ; i <= 100 ; i+=2){
            System.out.println(i);
        }

        //Generating Even No's Using (While) Loop from 1 to 100
//        System.out.println("Even No's From 1-100 Using While Loop \n");
//        int i = 2;
//        while (i <= 100){
//            System.out.println(i);
//            i += 2;
//        }

        //Generating Reverse Even No Using Loop from 100 to 1
        System.out.println("Reverse Even No's From 100-1 \n");
        for (int i = 100 ; i > 1 ; i-=2){
            System.out.println(i);
        }

        //Generating Reverse Even No's Using (While) Loop from 100 to 1
//        System.out.println("Even No's From 100-1 Using While Loop \n");
//        int i = 100;
//        while (i <= 2){
//            System.out.println(i);
//            i -= 2;
//        }

        //Generating Odd No Using Loop from 1 to 100
        System.out.println("Odd No's From 1-100 \n");
        for (int i = 1 ; i < 100 ; i+=2){
            System.out.println(i);
        }

        //Generating Odd No's Using (While) Loop from 1 to 100
//        System.out.println("Odd No's From 1-100 Using While Loop \n");
//        int i = 1;
//        while (i <= 100){
//            System.out.println(i);
//            i += 2;
//        }

        //Generating Reverse Odd No Using Loop from 99 to 1
        System.out.println("\nReverse Odd No's From 100-1 \n");
        for (int i = 99 ; i >= 1 ; i-=1){
            System.out.println(i);
        }

        //Generating Reverse Odd No's Using (While) Loop from 100 to 1
//        System.out.println("Odd No's From 100-1 Using While Loop \n");
//        int i = 99;
//        while (i <= 1){
//            System.out.println(i);
//            i -= 2;
//        }
    }
}
