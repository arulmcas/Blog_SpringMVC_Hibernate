package com.blogproject.address;

import com.blogproject.users.User;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String streetaddress;

    private String zip;

    private String landmark;

    @OneToOne(mappedBy="address")
    private User user;

    public Address(String streetaddress, String zip, String landmark) {
        this.streetaddress = streetaddress;
        this.zip = zip;
        this.landmark = landmark;
    }

    public Address() {
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetaddress;
    }

    public void setStreetAddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", streetAddress:'" + streetaddress + '\'' +
                ", zip:'" + zip + '\'' +
                ", landmark:'" + landmark + '\'' +
                '}';
    }
}
