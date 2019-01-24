package com.example.personapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "person")
public class Person {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String email;
    String number;
    String pincode;
    String city;

    @Ignore
    public Person(String name, String email, String number, String pincode, String city) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.pincode = pincode;
        this.city = city;
    }

    public Person(int id, String name, String email, String number, String pincode, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
        this.pincode = pincode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getPincode() {
        return pincode;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
