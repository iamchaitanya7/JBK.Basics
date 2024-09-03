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
            Account account1 = new Account (101, "Chaitanya", "9767", 1000.00);
            //Account account2 = new Account (102, "Akash", "1818", 2000.00);
            //Account account3 = new Account (103, "Pratik", "0103", 3000.00);
            //Account account4 = new Account (104, "Sanket", "0104", 4000.00);
            //Account account5 = new Account (105, "Chetan", "0105", 5000.00);

            System.out.println ("Initial " + account1);
            test.lineSeparator ();

            //Creating Object of Deposit Class and Depositing Money into Account.
            Deposit d = new Deposit (account1, "Chaitanya", "9767", 1500.00);
            test.lineSeparator ();

            //Creating Object of Withdraw Class and Withdrawing Money from Account for Specified Username.
            Withdraw w = new Withdraw (account1, "Chaitanya", "9767", 500);
            test.lineSeparator ();

            //Displaying the Final Updated Account Balance.
            System.out.println ("Final " + account1);

            //Account.displayAllAccounts();
            test.lineSeparator ();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}