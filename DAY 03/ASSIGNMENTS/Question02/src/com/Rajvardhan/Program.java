/*************************************
 * Author   :: Rajvardhan Patil
 * Question ::Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value.
 *************************************/
package com.Rajvardhan;

public class Program {

	public static void main(String[] args) {
		EmployeeTest EmployeeTest1 = new EmployeeTest("Rajvardhan", "Patil", 3000.0);
		System.out.println("Employee1 ::");
		System.out.println(EmployeeTest1.toString());
		System.out.println();
		EmployeeTest EmployeeTest2 = new EmployeeTest("Samarth", "Zadbuke", 3500.0);
		System.out.println("Employee2 ::");
		System.out.println(EmployeeTest2.toString());
		System.out.println();

		System.out.println("============After Raise of 10%===============");
		System.out.println("Employee1 ::");
		EmployeeTest1.applyRaise(10);
		System.out.println(EmployeeTest1.toString());
		System.out.println();
		System.out.println("Employee2 ::");
		EmployeeTest2.applyRaise(10);
		System.out.println(EmployeeTest2.toString());
		System.out.println();
	}

}
