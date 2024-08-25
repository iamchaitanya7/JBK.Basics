package com.jbk.mock;

import java.util.Scanner;

public class TestAccount {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.printf ("Enter Person's Salary: ");
        double sal = scan.nextDouble ();
        System.out.printf ("Enter Person's Username: ");
        String uName = scan.next ();
        System.out.printf ("Enter Person's Password: ");
        String pwd = scan.next ();

        Account obj = new Account ();
        obj.getSalary (sal, uName, pwd);

    }
}
