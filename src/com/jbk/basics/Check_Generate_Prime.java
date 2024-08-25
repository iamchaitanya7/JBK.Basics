package com.jbk.basics;

import java.util.Scanner;

public class Check_Generate_Prime {
    void lineSeperator () {
        System.out.println ("-----------------------------------------------");
    }

    //Checking of Weather Given Number is Prime or Not Using Boolean Variable;
    void checkPrime () {
        System.out.println ("Enter a Number to Check Weather Prime or Not: ");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt ( );
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println (num + " is a Prime Number");
        } else {
            System.out.println (num + " is Not a Prime Number");
        }
    }

    //Generating Prime No's for User Desired Number Range;  Ex:(1-100)
    void generatePrimeNo () {
        System.out.println ("Enter Start Number: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ( );
        System.out.println ("Enter End Number: ");
        int num2 = scan.nextInt ( );

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    isPrime = false;
                break;
            }
            if (isPrime && i > 1)
                System.out.println (i);
        }
    }

    public static void main (String[] args) {
        //gn.generatePrimeNo ();
        Check_Generate_Prime obj1 = new Check_Generate_Prime ( );
        Scanner scanner = new Scanner (System.in);
        obj1.lineSeperator ( );
        System.out.println ("Select a Choice from Below: \n 1.Check Prime \n 2.Generate Prime No");
        obj1.lineSeperator ( );
        int key = scanner.nextInt ( );

        switch (key) {
            case 1:
                obj1.checkPrime ( );
                obj1.lineSeperator ( );
                break;
            case 2:
                obj1.generatePrimeNo ( );
                obj1.lineSeperator ( );
                break;

            default:
                System.out.println ( "Select Proper Choice" );

        }
    }
}