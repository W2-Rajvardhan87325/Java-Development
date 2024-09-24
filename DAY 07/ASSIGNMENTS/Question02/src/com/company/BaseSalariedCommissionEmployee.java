package com.company;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BaseSalariedCommissionEmployee(String name, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(name, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    public void giveRaise() {
        this.baseSalary += baseSalary * 0.10; // 10% raise
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + baseSalary;
    }
}
