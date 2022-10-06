package org.example.medic_cs_19_1.model;

import java.util.List;

public class Patient {
    private int id;
    private String name;
    private String phone;
    private String address;
    private List<Disease> diseases;

    public Patient() {
    }

    public Patient(int id, String name, String phone, String address, List<Disease> diseases) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.diseases = diseases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}
