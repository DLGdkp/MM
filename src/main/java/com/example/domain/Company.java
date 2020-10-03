package com.example.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private int companyId;

    private String companyName;

    private int KVK;
    private String BTW;

    @ManyToOne
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Venue> venues;


    public Company(String companyName, int KVK, String BTW, Address address) {
        this.companyName = companyName;
        this.KVK = KVK;
        this.BTW = BTW;
        this.address = address;
    }

    public Company() {
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getKVK() {
        return KVK;
    }

    public void setKVK(int KVK) {
        this.KVK = KVK;
    }

    public String getBTW() {
        return BTW;
    }

    public void setBTW(String BTW) {
        this.BTW = BTW;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }
}
