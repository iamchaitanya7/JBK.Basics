package com.jbk.projects.withdraw;
import com.jbk.projects.account.Account;
import com.jbk.projects.account.InsufficientFunds;
import com.jbk.projects.account.InvalidAmount;
import com.jbk.projects.account.InvalidUsernamePin;

public class Withdraw {
    public Withdraw (Account acc, String name, String pin, double amount) throws InsufficientFunds, InvalidAmount, InvalidUsernamePin {
        //Validating the Initial Account Details(Acc_No, Name) Whether Match or Not then Only Withdrawing the Money from Account.
        if (pin == acc.getPin ( ) && name.equals (acc.getName ( )) && amount > 0) {

            //Validating the Account Details(Username, Pin) Whether Match or Not then Only Withdrawing the Money from Account.
            //acc = Account.findAccount(name, pin);
            //if (acc != null) {
            if (amount <= Account.getBalance ( )) {
                Account.setBalance(Account.getBalance() - amount);
                System.out.println("Withdrawn Amount: " + amount);
                System.out.println("Updated Account Balance: " + Account.getBalance());
            }
            else if (amount > Account.getBalance()) {
                throw new InsufficientFunds ("Insufficient Funds in Account! Withdrawal failed.");
                //System.out.println("Insufficient balance in Account.");
            }
            else {
                throw new InvalidAmount ("Invalid Amount! Enter Correct Amount");
                //System.out.println("Withdraw amount must be greater than zero.");
            }
        } else {
            throw new InvalidUsernamePin ("Invalid Username or Pin and Amount! Withdrawal failed.");
            //System.out.println("Invalid Username or Pin! Account details do not match. Withdrawal failed.");
        }
    }
}


//Also Try to check the whether if pin and amount is invalid then immediaetly throw a exception then proceed further.
