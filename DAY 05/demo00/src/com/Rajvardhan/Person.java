package com.Rajvardhan;

class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	void printRecord() {
		System.out.println("Name ::"+this.name);
		System.out.println("Age ::"+this.age);
	}
}

class Employee extends Person{
	private int empid;
	private String empDept;
	private double salary;
	
	public Employee(String name,int age,int empid,String empDept,double salary) {
		super(name, age);
		this.empid=empid;
		this.empDept=empDept;
		this.salary=salary;
	}
	
	@Override
	void printRecord() {
		this.printRecord();
		System.out.println("Employee ID ::"+this.empid);
		System.out.println("Employee Department ::"+this.empDept);
		System.out.println("Employye Salary ::"+this.salary);
	}
}