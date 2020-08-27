package com.lesson2;

import java.util.Arrays;

public class Lesson2Excercises {

	public static void main(String[] args) {
		System.out.println("1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;");
		changeArr();
		System.out.println();
		System.out.println("2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;");
		fillArray();
		System.out.println();
		System.out.println("3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;");		
		multiplyingArray();	
		System.out.println();
		//System.out.println("4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;");
		//minAndMaxElement() 
		System.out.println("5 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;");		
		diagonalElenents();
		

	}

	// 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1,
	// 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0
	// на 1, 1 на 0;
	public static void changeArr() {
		int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
			} else
				arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	// 2 Задать пустой целочисленный массив размером 8. Написать метод, который
	// помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
	public static void fillArray() {
		int[] arr = new int[8];

		for (int i = 0, j = 1; i < arr.length; i++, j = j + 3)
			arr[i] = j;

		System.out.println(Arrays.toString(arr));

	}

	// 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
	// принимающий на вход массив и умножающий числа меньше 6 на 2;
	public static void multiplyingArray() {
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6)
				arr[i] = arr[i] * 2;
		}
		System.out.println(Arrays.toString(arr));
	}

	// 4 Задать одномерный массив. Написать методы поиска в нём минимального и
	// максимального элемента;
//	public static void minAndMaxElement() {
//		int[] arr = { 9, 2, 3, 4, 1, 6, 7 };
//		int max = 0;
//		int min = 100;
//		for (int i = 0; i < arr.length; i++) {
//			if (min > arr[i])
//				min = arr[i];
//
//		}
//		System.out.println("min: " + min);
//	}

	// 5 * Создать квадратный целочисленный массив (количество строк и столбцов
	// одинаковое), заполнить его диагональные элементы единицами, используя
	// цикл(ы);

	public static void diagonalElenents() {
		int n = 3;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					arr[i][j] = 1;

				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}