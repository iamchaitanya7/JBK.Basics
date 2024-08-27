package com.jbk.projects.deposit;

import com.jbk.projects.account.Account;

public class Deposit {

    public Deposit (Account acc, int accNo, String name, double amount) {
        //Validating the Initial Account Details Whether Match or Not then Only Depositing the Money into Account.
        if (accNo == acc.getAccNo () && name.equals (acc.getName ())) {
            if (amount > 0) {
                Account.setBalance (Account.getBalance ( ) + amount);
                System.out.println ("Deposited Amount: " + amount);
                System.out.println ("Updated Account Balance: " + Account.getBalance ( ));
            } else {
                System.out.println ("Deposit amount must be greater than zero.");
            }
        } else {
            System.out.println ("Account details do not match. Deposit failed.");
        }
    }
}