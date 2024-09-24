package com.company;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, String ssn, double hourlyWage, double hoursWorked) {
        super(name, ssn);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
           
            return 40 * hourlyWage + (hoursWorked - 40) * hourlyWage * 1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourly wage: " + hourlyWage + "\nHours worked: " + hoursWorked;
    }
}
