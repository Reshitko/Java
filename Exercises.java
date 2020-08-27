package com.lesson1;

public class Exercises {

	public static void main(String[] args) {

		ResultDouble(); // exercise one
		Sum(); // exercise two
		PositiveNumber(); // exercise three
		Name(); // exercise four
		LeapYear(); // exercise five

	}

	public static void ResultDouble() {// exercise one
		int a = 2;
		int b = 10;
		int c = 15;
		int d = 3;
		double k = a * (b + (c / d));
		System.out.println(k + "\n");
	}

	public static void Sum() { // exercise two
		int i = 5;
		int j = 7;
		int sum = i + j;

		if (sum <= 20 && sum >= 10) {
			System.out.println("true \n");
		} else {
			System.out.println("false \n");
		}

	}

	public static void PositiveNumber() { // exercise three
		int i = -1;

		if (i >= 0) {
			System.out.println("Number: " + i + " is positive \n");
		} else {
			System.out.println("Number: " + i + " is not positive \n");
		}
	}

	public static void Name() { // exercise four
		String name = "Ruslan";

		System.out.println("Hello, " + name + "!\n");
	}

	public static void LeapYear() {// exercise five
		
		int year = 400;

		int k = year % 4;//  leap year
		int t = year % 400;//  leap year

		int q = year % 100;// not leap year

		if (k == 0 && q != 0 || t == 0) {
			System.out.println(year + " is leap year");

		} else {
			System.out.println(year + " is not leap year");
		}

	}
}
