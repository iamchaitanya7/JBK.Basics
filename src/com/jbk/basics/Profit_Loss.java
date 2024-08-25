package com.jbk.basics;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        System.out.println("CALCULATE PROFIT & LOSS ");
        System.out.println("Enter Price of Cost Price(CP) & SellingPrice(SP) : ");
        Scanner scan  = new Scanner(System.in);
        double cp = scan.nextInt();   //10
        double sp = scan.nextInt();   //20
        double proLos;
        proLos = sp - cp;
        if (proLos > 0)
            System.out.println("Profit gained is : " + proLos);   // 10, 20
        else if (proLos < 0) {
            System.out.println("Loss occured is : " + proLos);   // 20, 10
        }
        else if (proLos == 0) {
            System.out.println("No Profit or Loss");             // 10, 10
        }
    }
}
