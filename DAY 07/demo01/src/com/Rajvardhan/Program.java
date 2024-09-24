package com.Rajvardhan;

import java.util.Scanner;

public class Program {
	public static float divide(float num1, float num2) {
		if (num2 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		float num1 = 0, num2 = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("\t\tException Handling");
			System.out.print("Enter the First Number  :");
			num1 = sc.nextFloat();
			System.out.print("Enter the Second Number :");
			num2 = sc.nextFloat();
			result = divide(num1, num2);
			System.out.println("Result :" + result);
		} catch (ArithmeticException ar) {
			System.out.println("Divide by Zero Exception (Catch Block Executed...!)");
			if (ar instanceof ArithmeticException
			) {
				
			}
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Resources Closed(Finally Block Executed..!)");
		}

		System.out.println("\t\tRemaining Code....");
		System.out.println("Additon :" + (num1 + num2));
		System.out.println("Substraction :" + (num1 - num2));
		System.out.println("Multiplication :" + (num1 * num2));
		System.out.println("Modulas :" + (num1 % num2));
	}

}
