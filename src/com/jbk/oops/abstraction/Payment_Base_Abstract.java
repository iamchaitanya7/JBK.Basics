package com.jbk.oops.abstraction;

public abstract class Payment_Base_Abstract {
        // Abstract method (does not have a body)
        abstract void makePayment(double amount);

        // Concrete method (with body)
        void transactionSummary() {
            System.out.println("Transaction Completed.");
        }
}
