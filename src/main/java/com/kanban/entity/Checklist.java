package com.kanban.entity;

public class Checklist {

    private String name;
    private String location;

    private int mobileNo;

    private String Address;

    public Checklist(String name, String location, int mobileNo, String address) {
        this.name = name;
        this.location = location;
        this.mobileNo = mobileNo;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Checklist{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", mobileNo=" + mobileNo +
                ", Address='" + Address + '\'' +
                '}';
    }

    /// some change during main rebase tag1
    
  
}
