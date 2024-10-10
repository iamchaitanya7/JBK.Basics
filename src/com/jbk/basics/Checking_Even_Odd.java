package com.jbk.basics;
import java.util.Scanner;

public class Checking_Even_Odd {
    public static void main (String[] args) {
        System.out.println ("31-JULY-ASSIGNMENT-BASICS");

        //Finding out Weather the Given No is Even or Odd...!
        System.out.println ("Enter a Number: ");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt ( );   //10
        if (num % 2 == 0) {
            System.out.println ("Entered No " + num + " is Even No");
        } else {
            System.out.println ("Entered No " + num + " is Odd No");
        }
    }
}