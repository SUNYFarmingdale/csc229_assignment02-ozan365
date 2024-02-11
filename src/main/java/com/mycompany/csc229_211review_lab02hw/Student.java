package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    //field for GPA
    private double GPA;
    //constructor taking four parameters
    public Student(String name, short age, double GPA, String address) {
        //call to superclass constructor
        super(name,age);
        //only allow GPA between 0.0 and 4.0 inclusive
        this.GPA = (GPA >= 0.0 && GPA <= 4.0 ? GPA : 0.0);
        //changed access modifier of address in person to Protected to allow access in constructor and getter and setter
        this.address = address;
    }


    //required implementations of abstract methods from Person
    //getter for Address
    @Override
    public String getAddress() {
        return this.address;
    }

    //setter for Address
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    //getter for GPA
    public double getGPA() {
        return this.GPA;
    }

    //setter for GPA
    public void setGPA(double GPA) {
        //only allow GPA between 0.0 and 4.0 inclusive
        this.GPA = (GPA >= 0.0 && GPA <= 4.0 ? GPA : 0.0);
    }

    //override for toString method
    //returns name, age, address, and GPA formatted
    @Override
    public String toString(){
        return "Name: " + this.getName() +
                "\nAge: " + this.getAge() +
                "\nAddress: " + this.address +
                "\nGPA: " + this.GPA;
    }
}