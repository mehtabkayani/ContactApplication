package com.company.person;


public class Person {

    private String fullName;
    private String address;
    private String mobileNumber;
    private String workNumber = "Has no work number";
    private String dateOfBirth;

    public Person(String fullName, String address, String mobileNumber, String workNumber, String dateOfBirth) {
        this.fullName = fullName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.workNumber = workNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String fullName, String address, String mobileNumber, String dateOfBirth) {
        this.fullName = fullName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "Name: " + fullName +
                ", Address: " + address  +
                ", Mobile number: " + mobileNumber +
                ", Work number: " + workNumber +
                ", Date of birth: " + dateOfBirth;
    }
}
