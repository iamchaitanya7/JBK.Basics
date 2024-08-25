package com.jbk.basics;

import java.util.Scanner;

public class Calculator_Basic {
    //Generating a Line Seperator;
    void lineSeperator(){
        System.out.println ( "-----------------------------------------------" );
    }

    //Addition of Two Numbers User Defined;
    void addition(){
        System.out.println ("Enter a Number 1: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ();
        System.out.println ("Enter a Number 2: ");
        int num2 = scan.nextInt ();
        System.out.println ("Addition : " + (num1 + num2));
    }

    //Addition of (N) Numbers User Defined;
    void addition_N_Numbers(){
        System.out.println ("Enter a Choice Number (N): ");
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt ();
        int sum = 0;
        for (int i = 1; i <= N; i++){
            System.out.println ( "Enter Number " + i + ": " );
            int num = scan.nextInt ();
            sum += num;
        }
        System.out.println ("Addition of Entered Numbers is: " +sum);
    }

    //Substraction of Two Numbers User Defined;
    void substraction(){
        System.out.println ("Enter a Number 1: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ();
        System.out.println ("Enter a Number 2: ");
        int num2 = scan.nextInt ();
        System.out.println ("Substraction : " + (num1 - num2));
    }

    //Multiplication of Two Numbers User Defined;
    void multiplication(){
        System.out.println ("Enter a Number 1: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ();
        System.out.println ("Enter a Number 2: ");
        int num2 = scan.nextInt ();
        System.out.println ("Multiplication : " + (num1 * num2));
    }

    //Division of Two Numbers User Defined;
    void division(){
        System.out.println ("Enter a Number 1: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ();
        System.out.println ("Enter a Number 2: ");
        int num2 = scan.nextInt ();
        System.out.println ("Division : " + (num1 / num2));
    }

    //Checking of Weather Given Number is Prime or Not;
    void checkPrime () {
        System.out.println ("Enter a Number to Check Weather Prime or Not: ");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt ();
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println (num + "is a Prime Number");
        }
        else {
            System.out.println (num + "is Not a Prime Number");
        }
    }

    //Generating Prime No for User Desired Number Range;  Ex:(1-100)
    void generatePrimeNo() {
        System.out.println ( "Enter Start Number: " );
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        System.out.println ( "Enter End Number: " );
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0)
                    isPrime = false;
                break;
            }
            if (isPrime && i > 1)
                System.out.println(i);
        }
    }

    //Calculating the Power of Any Desired Number from User;  Ex:(25, 3)
    void numberPower(){
        System.out.println ( "Enter Number 1: " );
        Scanner scanner = new Scanner (System.in);
        int num1 = scanner.nextInt ();
        System.out.println ( "Enter Number 2: " );
        int num2 = scanner.nextInt ();
        //System.out.println ( "Power of " + num1 + ": " +(num1 ^ num2));
        double pow = 1;
        for (int i = 1; i <= num2; i++){
            pow *= num1;
        }
        System.out.println (pow);
    }

    //Main Method
    public static void main(String[] args) {
        Calculator_Basic obj1 = new Calculator_Basic ();
        Scanner scanner = new Scanner (System.in);
        obj1.lineSeperator ();
        System.out.println ("Select a Choice from Below: \n 1.Addition \n 2.Addition of (N) Numbers \n 3.Substraction \n 4.Multiplication \n 5.Division \n 6.Check Prime \n 7.Generate Prime No \n 8.Power of Number");
        obj1.lineSeperator ();
        int key = scanner.nextInt();

        switch (key){
            case 1:
                obj1.addition ();
                obj1.lineSeperator ();
                break;
            case 2:
                obj1.addition_N_Numbers();
                obj1.lineSeperator ();
                break;
            case 3:
                obj1.substraction ();
                obj1.lineSeperator ();
                break;
            case 4:
                obj1.multiplication ();
                obj1.lineSeperator ();
                break;
            case 5:
                obj1.division ();
                obj1.lineSeperator ();
                break;
            case 6:
                obj1.checkPrime ();
                obj1.lineSeperator ();
                break;
            case 7:
                obj1.generatePrimeNo ();
                obj1.lineSeperator ();
                break;
            case 8:
                obj1.numberPower ();
                obj1.lineSeperator ();
                break;
            default:
                System.out.println ( "Select a Valid Choice...!" );
                obj1.lineSeperator ();
                break;
        }
    }
}