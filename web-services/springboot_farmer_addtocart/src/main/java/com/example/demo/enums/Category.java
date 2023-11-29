package com.example.demo.enums;

public enum Category {

    Fashion("Fashion"), Grocery("Grocery"), Electronics("Electronics");

    private String category_cat;

    Category(String category_cat) {
        this.category_cat = category_cat;
    }
}
