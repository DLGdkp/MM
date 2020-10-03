package com.example.domain;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Address {

    @Id
    @GeneratedValue
    private int addressId;

    private String street;
    private int houseNumber;
    private String suffix;
    private String postalCode;
    private String city;

    public Address(int addressId, String street, int houseNumber, String suffix, String postalCode, String city) {
        this.addressId = addressId;
        this.street = street;
        this.houseNumber = houseNumber;
        this.suffix = suffix;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
