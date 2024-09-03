package com.jbk.projects.account;

public class InvalidUsernamePin extends RuntimeException {
    public InvalidUsernamePin (String message) {
        super (message);
    }
}
