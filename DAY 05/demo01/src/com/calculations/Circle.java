package com.calculations;
import java.util.Scanner; 

public class Circle implements Printable {

	public double radius;
	Scanner sc1= new Scanner(System.in);
	@Override
	public void acceptRecord() {
	System.out.printf("\t\tSHAPE::CIRCLE\n");
	System.out.print("Enter the Radius ::");
	this.radius=sc1.nextDouble();
	}
	
	@Override
	public double calculateArea() {
		return PI*this.radius*this.radius;
	}

	@Override
	public double calculatePeri() {
		return 2*PI*this.radius;
		
	}
	@Override
	public void printRecord() {
	System.out.println("Area of Circle ::"+this.calculateArea());	
	System.out.println("Perimeter of Circle ::"+this.calculatePeri());	
		
	}
	

}
