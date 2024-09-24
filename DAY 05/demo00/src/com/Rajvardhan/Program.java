package com.Rajvardhan;

public class Program {

	public static void main(String[] args) {
		Person p1=new Person("Rajvardhan", 22);
		p1.printRecord();
		System.out.println("============================================");
		Employee e1=new Employee("Samarth", 23, 1, "Computer Science", 100000.00);
		e1.printRecord();
	}

}
