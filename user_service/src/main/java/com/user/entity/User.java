package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String phone;
    private String name;

    List<Contact> contacts=new ArrayList<>();

    public User(Long userId, String phone, String name, List<Contact> contacts) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
        this.contacts = contacts;
    }

    public User(Long userId, String phone, String name) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


}
