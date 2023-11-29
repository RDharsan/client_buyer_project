package com.example.demo.enums;

public enum role{
    User("User"), Admin("Admin"),SuperAdmin("SuperAdmin");

    private String role_r;

    role(String role_r){
        this.role_r = role_r;
    }
}