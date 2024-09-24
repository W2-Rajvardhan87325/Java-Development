package com.calculations;

import java.util.Scanner;

public class Rectangle implements Printable {
	public double length;
	public double breadth;
	Scanner sc= new Scanner(System.in);
	@Override
	public void acceptRecord() {
	System.out.printf("\t\tSHAPE::RECTANGLE\n");
	System.out.print("Enter the Length ::");
	this.length=sc.nextDouble();
	System.out.print("Enter the Breadth ::");
	this.breadth=sc.nextDouble();
	}
	
	@Override
	public double calculateArea() {
		return this.length*this.breadth;
	}

	@Override
	public double calculatePeri() {
		return 2*(this.length+this.breadth);
		
	}
	@Override
	public void printRecord() {
	System.out.println("Area of Rectangle ::"+this.calculateArea());	
	System.out.println("Perimeter of Reactangle ::"+this.calculatePeri());	
		
	}

}
