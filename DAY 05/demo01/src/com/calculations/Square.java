package com.calculations;

import java.util.Scanner;

public class Square implements Printable{
	public double side;
	@Override
	public void acceptRecord() {
	
	Scanner sc= new Scanner(System.in);
	System.out.printf("\t\tSHAPE::SQUARE\n");
	System.out.print("Enter the Side ::");
	this.side=sc.nextDouble();
	}
	
	@Override
	public double calculateArea() {
		return this.side*this.side;
	}

	@Override
	public double calculatePeri() {
		return 4*this.side;
		
	}
	@Override
	public void printRecord() {
	System.out.println("Area of Square ::"+this.calculateArea());	
	System.out.println("Perimeter of Square ::"+this.calculatePeri());	
		
	}
}
