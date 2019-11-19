package com.example.servicetest;

import com.google.gson.annotations.SerializedName;

public class employ {

    @SerializedName("ID")
    private int id;

    @SerializedName("FirstName")
    private String fname;

    @SerializedName("LastName")
    private String lname;

    @SerializedName("Gender")
    private String gender;

    @SerializedName("Salary")
    private int Salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


    employ(){}
}
