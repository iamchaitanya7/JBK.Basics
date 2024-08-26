package com.jbk.projects.account;

public class Account {
    private int accNo;
    private String name;
    private static double balance;

    public Account(int accNo, String name, double initialBalance) {
        this.accNo = accNo;
        this.name = name;
        Account.balance = initialBalance;
    }

    //Using Getter & Setter Methods for Encapsulation of Class.
    public int getAccNo() {
        return this.accNo;
    }

    public void setAccNo (int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public static double getBalance() {
        return Account.balance;
    }

    public static void setBalance(double newBalance) {
        Account.balance = newBalance;
    }

    //Overriding the toString() Method.
    @Override
    public String toString() {
        return "Account Details { " + "Account No: " + this.accNo + ", Name: " + this.name + ", Balance: " + Account.balance + " }";
    }
}