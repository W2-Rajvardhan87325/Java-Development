package com.Rajvardhan;

public class EmployeeTest {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public EmployeeTest(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		setMonthlySalary(monthlySalary); // Use setter to validate
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0)
			monthlySalary = 0;
		this.monthlySalary = monthlySalary;
	}

	public double getYearlySalary() {
		return monthlySalary * 12;
	}

	public void applyRaise(double percentage) {
		if (percentage > 0) {
			monthlySalary += monthlySalary * (percentage / 100);
		}
	}
	@Override
	public String toString() {
		return "First Name ::"+this.firstName+"\nLast Name ::"+this.lastName+"\nMonthly ::"+this.monthlySalary;
	}
}
