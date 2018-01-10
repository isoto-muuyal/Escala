package com.muuyal.escala.passenger;

import java.*;

public class Passenger {


    private String name;
    private String travel;
    private Integer phone;
    private String eMail;
    private String addressStreet;
    private String addressCity;
    private String addressColony;
    private Integer addressPC;
    private String notes;
    private String id;

    Passenger(String name, int phone, String eMail) {
        this.setName(name);
        this.setPhone(phone);
        this.seteMail(eMail);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressColony() {
        return addressColony;
    }

    public void setAddressColony(String addressColony) {
        this.addressColony = addressColony;
    }

    public Integer getAddressPC() {
        return addressPC;
    }

    public void setAddressPC(Integer addressPC) {
        this.addressPC = addressPC;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}