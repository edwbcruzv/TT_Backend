package com.escom.Creadordecasos.Exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("The user has not found");
    }
}
