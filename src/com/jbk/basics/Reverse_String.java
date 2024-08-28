package com.jbk.basics;


public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("02-AUGUST-TASK-1-BASICS");

        /*
        Converting the Given String to Reversed String...!
        Given String : "The Kiran Academy"    or User Defined String using (Scanner) class.
        Output : ymedacA nariK ehT
         */

        System.out.println("String Reversal");
        String s1 = "The Kiran Academy";
        for (int i = s1.length()-1 ; i >= 0 ;  i--){
            System.out.print(s1.charAt(i));   //Just add println() to get each Reversed Character on New Line...!
        }

    }
}
