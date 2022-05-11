package com.trycatch;

import java.util.Scanner;

class UnderAgeException extends Exception {
	public String toString() {
		return "Age is less than 18";
	}
}

class OverAgeException extends Exception {

	public String toString() {
		return "Age is more than 65";
	}
}

class CheckAge {
	int age;

	void collectAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

	}

	void verifyAge() throws UnderAgeException, OverAgeException {
		if (age >= 18 && age <= 65) {
			System.out.println("Give License");
		} else if (age < 18) {
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		} else {
			OverAgeException oae = new OverAgeException();
			throw oae;
		}
	}
}

class Person {
	void personCheck() {
		CheckAge ca = new CheckAge();
		ca.collectAge();
		try {
			ca.verifyAge();
		} catch (UnderAgeException e) {
			System.out.println(e.toString());
		} catch (OverAgeException e) {
			System.out.println(e.toString());
		}
	}

}

public class ExampleTryCatch {

	public static void main(String[] args) {
		Person p = new Person();
		p.personCheck();
	}

}
