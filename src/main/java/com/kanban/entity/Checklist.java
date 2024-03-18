package com.kanban.entity;

public class Checklist {

    private String name;
    private String location;

    public Checklist(String name, String location) {
        this.name = name;
        this.location = location;
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

    @Override
    public String toString() {
        return "Checklist{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
