package com.example.demo.exception;

public class DataNotFound_Exception extends Exception {

    private String message;


    public DataNotFound_Exception(String message) {
        super(message);
        this.message = message;
    }
}