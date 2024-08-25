package com.jbk.basics;
import java.util.Scanner;

public class Operators_B_All {
    public static void main(String[] args) {
        System.out.println("JBK OPERATORS BASICS");

        //Checking Smallest Number from User Defined 3 Numbers...!
        System.out.println("Enter Values of A, B, and C: ");
        Scanner scan  = new Scanner(System.in);
        int a = scan.nextInt();   //10
        int b = scan.nextInt();   //15
        int c = scan.nextInt();   //20

        if (a==b && a == c)
            System.out.println("All are equal");
        else if (a==b && a < c) {
            System.out.println("A and B are equal and Smaller than C");
        }
        else if (a==c && a < b) {
            System.out.println("A and C are equal and Smaller than B");
        }
        else if (c==b && c < a) {
            System.out.println("C and B are equal and Smaller than A");
        }
        else if (a < b && a < c) {
            System.out.println("A is Smaller than B and C");
        }
        else if (b < a && b < c){
            System.out.println("B is Smaller than A and C");
        }
        else if (c < a && c < b)  {
            System.out.println("C is Smaller than A and B");
        }
    }
}