package com.Rajvardhan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<Book> bk = new HashSet<>();

		Collections.addAll(bk,
				new Book(4, "The Alchemist", "Novel", 493.23),
				new Book(1, "The Archer", "Novel", 723.53),
				new Book(5, "The Fountainhead", "Novel", 652.73),
				new Book(2, "Atlas Shrugged", "Novel", 872.94),
				new Book(6, "Harry Potter", "Novel", 423.68),
				new Book(3, "Lord of Rings", "Novel", 621.53));

		System.out.println(bk);
	}

}
