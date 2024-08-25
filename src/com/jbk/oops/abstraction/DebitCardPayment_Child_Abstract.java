package com.jbk.oops.abstraction;

public class DebitCardPayment_Child_Abstract extends Payment_Base_Abstract{
        @Override
        void makePayment(double amount) {
            System.out.println("Processing DebitCard payment of $" + amount);
        }
}