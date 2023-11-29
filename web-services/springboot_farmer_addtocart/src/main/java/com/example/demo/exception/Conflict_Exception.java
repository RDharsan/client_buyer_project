package com.example.demo.exception;

public class Conflict_Exception extends  Exception{

    private String message;

    public Conflict_Exception(String message) {
        super(message);
        this.message = message;
    }
}
