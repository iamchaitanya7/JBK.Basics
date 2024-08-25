package com.jbk.basics;
import java.util.Scanner;

public class Generate_Reverse_No {
    public static void main(String[] args) {
        System.out.println("01-AUGUST-TASK-2-BASICS");

        /*
        Converting the Given Number to it's Reversed Number form...!
        Given Number = 12345
        Output : 54321
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        int x = 0;
        while (num > 0){
            int res = num % 10;
            x = ( x * 10 + res);
            //System.out.println(x);
            num = num / 10;
        }
        System.out.println(x);    //Addon for getting no Reversed Number
    }
}