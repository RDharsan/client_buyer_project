package com.example.demo.enums;

public enum Status {

    Ordered("Ordered"),Cancelled("Cancelled"),Delivered("Delivered");

    private String status;

    Status(String status){
        this.status = status;
    }

}