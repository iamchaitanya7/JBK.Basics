package com.jbk.projects.deposit;

import com.jbk.projects.account.Account;
import com.jbk.projects.account.*;

public class Deposit {

    public Deposit (Account acc, String name, String pin, double amount) throws InvalidAmount, InvalidUsernamePin {
        //Validating the Initial Account Details(Acc_No, Name) Whether Match or Not then Only Depositing the Money into Account.
        if (pin == acc.getPin ( ) && name.equals (acc.getName ( ))) {

            //Validating the Account Details(Name, Pin) Whether Match or Not then Only Depositing the Money into Account.
            //acc = Account.findAccount(name, pin);
            //if (acc != null) {
            if (amount > 0) {
                Account.setBalance (Account.getBalance ( ) + amount);
                System.out.println ("Deposited Amount: " + amount);
                System.out.println ("Updated Account Balance: " + Account.getBalance ( ));
            } else {
                throw new InvalidAmount ("Invalid Amount! Enter Correct Amount");
                //System.out.println ("Deposit amount must be greater than zero.");
            }
        } else {
            throw new InvalidUsernamePin ("Invalid Username and Pin! Account details do not match. Deposit failed.");
            //System.out.println ("Invalid Username and Pin! Account details do not match. Deposit failed.");
        }
    }
}