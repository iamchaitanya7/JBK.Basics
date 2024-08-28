package com.jbk.basics;

import java.util.Scanner;

public class Test_Generate_Reverse_No_Str_Arr {

    void lineSeparator () {
        System.out.println ("======================================================");
    }

    public static void main (String[] args) {
        Test_Generate_Reverse_No_Str_Arr test = new Test_Generate_Reverse_No_Str_Arr ( );
        Generate_Reverse_No_Str_Arr obj = new Generate_Reverse_No_Str_Arr ( );
        test.lineSeparator ( );
        System.out.println ("Select a Operation to Perform: \n 1.Number Reversal \n 2.String Reversal \n 3.Array Reversal \n 4.Exit");
        test.lineSeparator ( );
        Scanner scan = new Scanner (System.in);
        int key = scan.nextInt ( );

        switch (key) {
            case 1:
                test.lineSeparator ( );
                System.out.println ("Enter a Number to Reverse: ");
                int num = scan.nextInt ( );
                test.lineSeparator ( );
                obj.reverseNumber (num);
                test.lineSeparator ( );
                break;

            case 2:
                test.lineSeparator ( );
                System.out.println ("Enter a String to Reverse: ");
                String str = scan.next ( );
                test.lineSeparator ( );
                obj.reverseString (str);
                test.lineSeparator ( );
                break;

            case 3:
                test.lineSeparator ( );

                System.out.println ("Enter the Size of the Array: ");
                int size = scan.nextInt ( );
                int[] arr = new int[size];
                test.lineSeparator ( );
                System.out.println ("Enter " + size + " elements: ");
                for (int i = 0; i < size; i++) {
                    arr[i] = scan.nextInt ( );
                }
                test.lineSeparator ( );
                obj.reverseArray (arr);
                break;

            case 4:
                test.lineSeparator ( );
                System.out.println ("Exiting the program....");
                System.exit (0);

            default:
                test.lineSeparator ( );
                System.out.println ("Invalid Choice....! Please Select Again");
                test.lineSeparator ( );
        }
    }
}
