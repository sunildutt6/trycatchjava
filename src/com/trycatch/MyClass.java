package com.trycatch;

import java.util.Scanner;

class InvalidCustomerException extends Exception {
	public String toString() {
		return "Invalid Customer";
	}
}

class Customer {
	int accno = 111;
	int pin = 234;

	int accno1;
	int pin1;

	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accno:");
		accno1 = sc.nextInt();
		System.out.println("Enter the pin:");
		pin1 = sc.nextInt();
	}

	void verify() throws InvalidCustomerException {
		if (accno == accno1 && pin == pin1) {
			System.out.println("Valid Customer");
		} else {
			InvalidCustomerException ice = new InvalidCustomerException();
			System.out.println(ice.toString());
			throw ice;
		}
	}
}

class Bank {
	void customerCheck() {
		Customer c1 = new Customer();
		c1.collectData();
		try {
			c1.verify();
		} catch (InvalidCustomerException e) {
			e.printStackTrace();
		}
	}
}

public class MyClass {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.customerCheck();
	}

}
