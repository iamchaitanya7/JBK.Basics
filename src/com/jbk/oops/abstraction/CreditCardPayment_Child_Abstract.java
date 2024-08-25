package com.jbk.oops.abstraction;

public class CreditCardPayment_Child_Abstract extends Payment_Base_Abstract{
        @Override
        void makePayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
}
