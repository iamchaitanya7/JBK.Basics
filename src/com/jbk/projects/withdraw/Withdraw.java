package com.jbk.projects.withdraw;
import com.jbk.projects.account.Account;

public class Withdraw {
    public Withdraw(Account acc, int accNo, String name, double amount) {
        //Validating the Initial Account Details Whether Match or Not then Only Withdrawing the Money from Account.
        if (accNo == acc.getAccNo() && name.equals(acc.getName())) {
            if (amount > 0 && amount <= Account.getBalance()) {
                Account.setBalance(Account.getBalance() - amount);
                System.out.println("Withdrawn Amount: " + amount);
                System.out.println("Updated Account Balance: " + Account.getBalance());
            }
            else if (amount > Account.getBalance()) {
                System.out.println("Insufficient balance in Account.");
            }
            else {
                System.out.println("Withdraw amount must be greater than zero.");
            }
        } else {
            System.out.println("Account details do not match. Withdrawal failed.");
        }
    }
}
