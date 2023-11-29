package com.example.demo.exception;

public class DuplicateElement_Exception extends Exception {

    private String message;

    public DuplicateElement_Exception(String message) {
        super(message);
        this.message = message;
    }
}
