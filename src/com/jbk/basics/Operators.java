package com.jbk.basics;
import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT-9005 PRG - 1 TO 5 ");

        //Performing Various Arithmetic Operations...!
        System.out.println("Enter Values of A and B : ");
        Scanner scan  = new Scanner(System.in);
        int a = scan.nextInt();   //10
        int b = scan.nextInt();   //20

        System.out.println("Addition of Entered No's : " + (a + b));   // 10, 20
        System.out.println("Substraction of Entered No's : " + (a - b));   // 20, 10
        System.out.println("Product of Entered No's : " + (a * b));   // 10, 2
        System.out.println("Division of Entered No's : " + (a / b));   // 20, 10
        System.out.println("Entered No.1 : " + a + " No.2 : " + b );   // 20, 10
    }
}
