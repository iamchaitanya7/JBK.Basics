package com.jbk.basics;

import java.util.Scanner;

public class printCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start character: ");
        char startChar = scanner.next().charAt(0);
        System.out.print("Enter the end character: ");
        char endChar = scanner.next().charAt(0);
        scanner.close();
        if (startChar > endChar) {
            System.out.println("Start character must be less than or equal to the end character.");
            return;
        }
        int counter = 0;
        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.print(ch + " ");
            counter++;
            if (counter % 20 == 0) {
                System.out.println();
            }
        }
    }
}
