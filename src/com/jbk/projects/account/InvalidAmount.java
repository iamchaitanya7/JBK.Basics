package com.jbk.projects.account;

public class InvalidAmount extends RuntimeException {
    public InvalidAmount (String message) {
        super (message);
    }
}
