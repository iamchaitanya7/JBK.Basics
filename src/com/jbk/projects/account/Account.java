package com.jbk.projects.account;

import java.util.ArrayList;

public class Account {
    private int accNo;
    private String name;
    private String pin;
    private static double balance;

    //Creation of Static list to store account details.
    //private static ArrayList<Account> accountList = new ArrayList<>();

    public Account (int accNo, String name, String pin, double initialBalance) {
        this.accNo = accNo;
        this.name = name;
        this.pin = pin;
        Account.balance = initialBalance;

        //Adding this account details to the accountList.
        //accountList.add(this);
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

    public String getPin () {
        return pin;
    }

    public void setPin (String pin) {
        this.pin = pin;
    }

    public static double getBalance() {
        return Account.balance;
    }

    public static void setBalance(double newBalance) {
        Account.balance = newBalance;
    }

    //Method to get the accountList.
    /*public static ArrayList<Account> getAccountList() {
        return accountList;
    }

    //Method to find an account by name and pin from accountList.
    public static Account findAccount(String name, String pin) {
        for (Account account : accountList) {
            if (account.getName().equalsIgnoreCase(name) && account.getPin().equals(pin)) {
                return account;
            }
        }
        return null;
    }

    //Static method to Display all Accounts Details from accountList.
    public static void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accountList) {
            System.out.println(account);        //Calls the overridden toString() method.
        }
    }*/

    //Overriding the toString() Method.
    @Override
    public String toString() {
        return "Account Details { " + "Account No: " + this.accNo + ", Name: " + this.name + ", Balance: " + Account.balance + " }";
    }
}