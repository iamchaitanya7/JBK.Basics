package com.jbk.oops.abstraction;

public class Test_PaymentSystem {
        public static void main(String[] args) {
            Payment_Base_Abstract payment;

            // User chooses CreditCardPayment
            payment = new CreditCardPayment_Child_Abstract ();
            payment.makePayment(100.0);
            payment.transactionSummary();

            // User chooses PayPalPayment
            payment = new DebitCardPayment_Child_Abstract ();
            payment.makePayment(250.0);
            payment.transactionSummary();
        }
}