package com.homework_to_lesson_4;

/**
 * Homework:4 
 * 8/20/2020
 * @author Reshitko Ruslan
 *
 */
public class Colleague {

	private String fullName;
	private int salary;
	private int age;

	public Colleague(String fullName, int salary, int age) {
		this.fullName = fullName;
		this.salary = salary;
		this.age = age;

	}

	public String getFullName() {
		return fullName;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 4. Вывести при помощи методов из пункта 3 ФИО и возраст.
	public String getInfo() {
		return String.format(getFullName() + " " + getAge());
	}

}
