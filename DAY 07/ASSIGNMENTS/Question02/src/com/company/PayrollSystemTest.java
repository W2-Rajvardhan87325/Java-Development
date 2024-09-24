package com.company;

public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

       
        employees[0] = new SalariedEmployee("Raj Patil", "111-11-1111", 800.0);
        employees[1] = new HourlyEmployee("Shrenu", "222-22-2222", 16.75, 42);
        employees[2] = new CommissionEmployee("Dhanashri", "333-33-3333", 10000, 0.06);
        employees[3] = new BaseSalariedCommissionEmployee("Sam", "444-44-4444", 5000, 0.04, 300);

       
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Earned: $%.2f\n\n", employee.earnings());

            
            if (employee instanceof BaseSalariedCommissionEmployee) {
                BaseSalariedCommissionEmployee baseEmployee = (BaseSalariedCommissionEmployee) employee;
                System.out.println("Giving 10% raise to base salary...");
                baseEmployee.giveRaise();
                System.out.printf("New earnings after raise: $%.2f\n\n", baseEmployee.earnings());
            }
        }
    }
}
