package com.jbk.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Generate_Reverse_No_Str_Arr {

    //Method to Reverse the Given Number.
    public void reverseNumber (int num) {
        //System.out.println ("Number Reversal");
        int reverseNo = 0;
        while (num > 0) {
            int digit = num % 10;
            reverseNo = (reverseNo * 10 + digit);
            //System.out.println(x);
            num /= 10;
        }
        System.out.println ("Reversed Number: " + reverseNo);
    }

    //Method to Reverse the Given String.
    public void reverseString (String str) {
        //System.out.println ("String Reversal");
        for (int i = str.length ( ) - 1; i >= 0; i--) {
            System.out.print (str.charAt (i));
        }
        System.out.println ( );
    }

    //Method to Reverse the Given String using StringBuilder.
    /*
    public String stringReversal(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    */

    //Method to Reverse the Given Array.
    public void reverseArray (int[] arr) {
        //Created a New Array that is initialized to the size of the coming {Array.length()}.
        int[] resArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.println (arr[i] + " ");            //Can Also be used to display each reversed array element individually.
            resArr[j] = arr[i];                            //Creation of New Array that stores the Reversed Array.
            j++;
        }
        System.out.println ("Reversed Array: " + Arrays.toString (resArr));
        //Used { Arrays.to.String() } method to display the array elements directly.

    }
}