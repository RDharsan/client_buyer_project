package com.example.demo.dto;


import lombok.*;

public class AddressDTO {

    private String postbox_No_a;

    private String land_mark_a;

    private String zipcode_a;

    private String phoneNumber_a;

    private String city_a;

    public AddressDTO() {}

    public String getPostboxNo() {
        return postbox_No_a;
    }

    public void setPostboxNo(String postbox_No_a) {
        this.postbox_No_a = postbox_No_a;
    }

    public String getLandmark() {
        return land_mark_a;
    }

    public void setLandmark(String land_mark_a) {
        this.land_mark_a = land_mark_a;
    }

    public String getZipcode() {
        return zipcode_a;
    }

    public void setZipcode(String zipcode_a) {
        this.zipcode_a = zipcode_a;
    }

    public String getPhoneNumber() {
        return phoneNumber_a;
    }

    public void setPhoneNumber(String phoneNumber_a) {
        this.phoneNumber_a = phoneNumber_a;
    }

    public String getCity() {
        return city_a;
    }

    public void setCity(String city_a) {
        this.city_a = city_a;
    }
}