package com.company;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String ssn, double weeklySalary) {
        super(name, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeekly salary: " + weeklySalary;
    }
}
