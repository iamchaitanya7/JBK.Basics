package com.jbk.basics;

import java.util.Scanner;

public class Checking_Prime_Or_Not_Cnt {
    public static void main(String[] args) {
        System.out.println ("31-JULY-TASK-2-BASICS");

        //Finding Weather Given No is Prime or Not Using Counter Variable...!
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a Number: ");
        int num = scan.nextInt ( );
        int count = 0;
        if (num <= 1) {
            System.out.println ("The Number is not prime");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                //System.out.println(i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println ("The Number " + num + " is a Prime No");
        } else {
            System.out.println ("The Number " + num + " is Not a Prime No");
        }
    }
}


