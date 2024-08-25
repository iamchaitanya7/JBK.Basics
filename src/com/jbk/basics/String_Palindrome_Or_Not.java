package com.jbk.basics;

public class String_Palindrome_Or_Not {
    public static void main (String[] args) {

        String str = "Radar", reverseStr = "";

        int strLength = str.length ( );

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt (i);
        }

        if (str.equalsIgnoreCase (reverseStr)) {
            System.out.println (str + " is a Palindrome String.");
        } else {
            System.out.println (str + " is not a Palindrome String.");
        }
    }
}