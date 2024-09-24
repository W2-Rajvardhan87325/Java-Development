package com.company;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String ssn, double grossSales, double commissionRate) {
        super(name, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGross sales: " + grossSales + "\nCommission rate: " + commissionRate;
    }
}
