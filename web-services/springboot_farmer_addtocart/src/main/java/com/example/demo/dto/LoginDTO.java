package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class LoginDTO {

    private String username_lo;
    private String password_lo;

    public String getusername_lo() {
        return username_lo;
    }

    public void setusername_lo(String username_lo) {
        this.username_lo = username_lo;
    }

    public String getpassword_lo() {
        return password_lo;
    }

    public void setpassword_lo(String password_lo) {
        this.password_lo = password_lo;
    }
}
