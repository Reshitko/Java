package com.homework_to_lesson_5;

/**
 * Homework:5
 * 8/24/2020
 * @author Reshitko Ruslan
 *
 */
public class Main {

	public static void main(String[] args) {

		Cat c = new Cat(200, 2, 0);
		Dog d = new Dog(500, 0.5, 10);
		Animal d2 = new Dog(600, 0.5, 10);

		Animal[] zoo = { c, d, d2 };
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i] instanceof Cat) {
				((Cat) zoo[i]).setRun(210);
				((Cat) zoo[i]).setJumpBarrier(1);
				((Cat) zoo[i]).setSwim(5);
			}
			if (zoo[i] instanceof Dog) {
				((Dog) zoo[i]).setRun(510);
				((Dog) zoo[i]).setJumpBarrier(0.2);
				((Dog) zoo[i]).setSwim(9);

			}

		}

	}

}
