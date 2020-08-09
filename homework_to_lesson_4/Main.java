package com.homework_to_lesson_4;

/**
 * Homework:4 8/20/2020
 * 
 * @author Reshitko Ruslan
 *
 * 1.Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст.
 * 2.Конструктор класса должен заполнять эти поля при создании объекта.
 * 3.Внутри класса «Сотрудник» написать методы, которые возвращают
 *   значение каждого поля.
 * 4.Вывести при помощи методов из пункта 3 ФИО и возраст. 
 * 5.Создать массив из 5 сотрудников. С помощью цикла вывести
 *   информацию только о сотрудниках старше 40 лет;
 * 6.Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 * 7.Подсчитать средние арифметические зарплаты и возраста. 8.Продумать
 *   конструктор таким образом, чтобы при создании каждому сотруднику
 *   присваивался личный уникальный идентификационный порядковый номер
 *
 */

public class Main {

	// 6* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
	public static void increaseOfWagesTwo(Colleague[] colleagueArray) {
		int salaryPlus = 0;
		for (int i = 0; i < colleagueArray.length; i++) {
			if (colleagueArray[i].getAge() > 45) {
				salaryPlus = colleagueArray[i].getSalary() + 5000;
				colleagueArray[i].setSalary(salaryPlus);
			}
			System.out
					.println("Colleague " + colleagueArray[i].getFullName() + " has " + colleagueArray[i].getSalary());
		}
	}

	// 7* Подсчитать средние арифметические зарплаты и возраста
	public static void arithmeticMeans(Colleague[] colleagueArray) {
		int sumSalary = 0;
		int sumAge = 0;
		for (int i = 0; i < colleagueArray.length; i++) {
			sumSalary += colleagueArray[i].getSalary();
			sumAge += colleagueArray[i].getAge();
		}
		System.out.println("arithmetic average salary: " + sumSalary / colleagueArray.length);
		System.out.println("arithemetic average age: " + sumAge / colleagueArray.length);
	}

	public static void main(String[] args) {

		Colleague freeman = new Colleague("Morgan Freeman", 250_000, 83);
		Colleague cage = new Colleague("Nicolas Cage", 300_000, 56);
		Colleague gosling = new Colleague("Ryan Gosling", 200_000, 39);
		Colleague pattinson = new Colleague("Robert Pattinson", 180_000, 34);
		Colleague watson = new Colleague("Emma Watson", 270_000, 30);

		System.out.println();

		System.out.println("----------------------- task 5 -----------------------");
		// 5* Создать массив из 5 сотрудников. С помощью цикла вывести информацию только
		// о сотрудниках старше 40 лет;
		Colleague[] colleagueArray = { freeman, cage, gosling, pattinson, watson };
		for (int i = 0; i < colleagueArray.length; i++) {
			if (colleagueArray[i].getAge() > 40) {
				System.out.println("Colleague over 40 years old: " + colleagueArray[i].getFullName() + ": "
						+ colleagueArray[i].getAge() + " years old");
			}
		}

		System.out.println("\n----------------------- task 6 -----------------------");
		// 6* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
		increaseOfWagesTwo(colleagueArray);

		System.out.println("\n----------------------- task 7 -----------------------");
		// 7* Подсчитать средние арифметические зарплаты и возраста
		arithmeticMeans(colleagueArray);

	}

}
