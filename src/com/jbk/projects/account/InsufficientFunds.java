package com.jbk.projects.account;

public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds (String message) {
        super (message);
    }
}
