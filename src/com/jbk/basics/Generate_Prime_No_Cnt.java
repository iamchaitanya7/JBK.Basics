package com.jbk.basics;

public class Generate_Prime_No_Cnt {
    public static void main (String[] args) {
        //Generating Prime No's from 1-100 Using Counter Variable...!
        for (int i = 1; i <= 100; i++){
            int counter = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0)
                    counter++;
            }
            if (counter == 2)
                System.out.println(i);
        }
    }
}
