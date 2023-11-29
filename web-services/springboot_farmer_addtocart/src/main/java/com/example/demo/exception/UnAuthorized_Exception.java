package com.example.demo.exception;

public class UnAuthorized_Exception extends Exception {

    private static final long serialVersionUID = 1L;

    public UnAuthorized_Exception(String message) {
        super(message);
    }

}