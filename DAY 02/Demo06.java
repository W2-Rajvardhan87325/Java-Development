import java.util.*;

public class Demo06 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // Employee emp1 = new Employee(emp1);
        emp1.putdata();
    }
}

class Employee {
    private int empId;
    private String empName;
    private String empCompany;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Id       :");
        this.empId = sc.nextInt();
        System.out.print("Enter the Employee Name     :");
        sc.nextLine();
        this.empName = sc.nextLine();
        System.out.print("Enter the Employee Company  :");
        this.empCompany = sc.nextLine();
    }

    public void putdata() {
        System.out.println("Employee ID     :" + empId);
        System.out.println("Employee Name   :" + empName);
        System.out.println("Employee Company:" + empCompany);
    }

}
