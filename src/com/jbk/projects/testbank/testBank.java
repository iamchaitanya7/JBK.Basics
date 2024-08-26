package com.jbk.projects.testbank;

import com.jbk.projects.account.Account;
import com.jbk.projects.deposit.Deposit;
import com.jbk.projects.withdraw.Withdraw;

public class testBank {
    //Creating a LineSeparator Method.
    void lineSeparator () {
        System.out.println ("=========================================================================");
    }

    public static void main (String[] args) {
        try {
            testBank test = new testBank ();
            //Assigning the Account Class Variables with Initial Details.
            test.lineSeparator ();
            Account account = new Account (101, "Chaitanya", 1000.00);
            System.out.println ("Initial " + account);
            test.lineSeparator ();

            //Creating Object of Deposit Class and Depositing Money into Account.
            Deposit d = new Deposit (account, 101, "Chaitanya", 1500.00);
            test.lineSeparator ();

            //Creating Object of Withdraw Class and Withdrawing Money from Account for Specified Username.
            Withdraw w = new Withdraw (account, 101, "Chaitanya", 500.00);
            test.lineSeparator ();

            //Displaying the Final Updated Account Balance.
            System.out.println("Final " + account);
            test.lineSeparator ();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}