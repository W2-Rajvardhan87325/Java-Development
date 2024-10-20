package com.Rajvardhan;

import java.util.Objects;

enum Roll {
	BATSMAN, BOWLER;
}

public class Cricketer {
	private String name;
	private String gender;
	private String email;
	private Roll roll;
	private int age;
	private long contact;
	private int rating;

	public Cricketer() throws OverratedException, UnderratedException {
		this("", "", "", Roll.BATSMAN, 0, 0, 0); // Default enum value used for roll
	}

	public Cricketer(String name, String gender, String email, Roll roll, int age, long contact, int rating)
			throws OverratedException, UnderratedException {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.roll = roll;
		this.age = age;
		this.contact = contact;
		setRating(rating);
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public long getContact() {
		return contact;
	}

	public int getRating() {
		return rating;
	}

	public int getAge() {
		return age;
	}

	public Roll getRoll() {
		return roll;
	}

	// Setters
	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;
	}

	// Exception Handling
	public void setRating(int rating) throws UnderratedException, OverratedException {
		if (rating < 0) {
			throw new UnderratedException("Ratings cannot be negative (Underrated exception)");
		} else if (rating > 5) {
			throw new OverratedException("Ratings cannot be more than 5 (Overrated exception)"); // Fixed message
		} else {
			this.rating = rating;
		}
	}

	// For name field Comparison
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return Objects.equals(name, other.name);
	}

	// toString to Display Details
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", gender=" + gender + ", email=" + email + ", roll=" + roll + ", age=" + age
				+ ", contact=" + contact + ", rating=" + rating + "]";
	}
}
