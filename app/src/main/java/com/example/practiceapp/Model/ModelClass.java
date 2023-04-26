package com.example.practiceapp.Model;

import java.io.Serializable;

public class ModelClass implements java.io.Serializable {
    private String name;
    private String phone;

    public ModelClass(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
