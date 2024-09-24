package com.company;

public abstract class Employee {
    private String name;
    private String socialSecurityNumber;

    public Employee(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

  
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee: " + name + "\nSSN: " + socialSecurityNumber;
    }
}
