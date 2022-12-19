package com.student.model;

public class Student {

    private int studid;
    private String name;
    private String address;

    public Student()
    {
    }

    public Student(int studid, String name, String address) {
        this.studid = studid;
        this.name = name;
        this.address = address;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudid() {
        return studid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
