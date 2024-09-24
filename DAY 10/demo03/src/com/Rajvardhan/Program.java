package com.Rajvardhan;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Program {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("======================QUEUE ::1======================");
		System.out.println("Created using (offerFirst|addFirst && pollLast|removeLast && getLast|peekLast)");

		int number = 0;
		System.out.println("Enter the Elements(Only 5)(Seprated by Spaces)::");
		for (int i = 1; i <= 5; i++) {
			System.out.print("Element ::" + i + "  Value ::");
			number = sc.nextInt();
			stack.offerFirst(number);
		}
		System.out.println("Printing the Size of the Stack ::" + stack.size());
		System.out.println("Printing the elements of Stack (LIFO Order) ::");
		// System.out.println(stack);// Printed Using tostring() method
		System.out.println("Printing the top of the Stack ::" + stack.peekLast());
		while (!stack.isEmpty()) {
			System.out.println(stack.pollLast());
		}

		System.out.println("======================QUEUE ::2======================");
		System.out.println("Created using (offerLast|addLast && pollFirst|removeFirst && peek|getFirst|peekFirst)");
		number = 0;
		System.out.println("Enter the Elements(Only 5)(Seprated by Spaces)::");
		for (int i = 1; i <= 5; i++) {
			System.out.print("Element ::" + i + "  Value ::");
			number = sc.nextInt();
			stack.offerLast(number);
		}
		System.out.println("Printing the Size of the Stack ::" + stack.size());
		System.out.println("Printing the elements of Stack (LIFO Order) ::");
		// System.out.println(stack);// Printed Using tostring() method
		System.out.println("Printing the top of the Stack ::" + stack.peek());
		while (!stack.isEmpty()) {
			System.out.println(stack.pollFirst());
		}
		sc.close();

	}

}
