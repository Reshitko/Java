package com.homework_to_lesson_5;

/**
 * Homework:5
 * 8/24/2020
 * @author Reshitko Ruslan
 *
 */
public class Cat extends Animal {

	public Cat(int lengthRun, double heightJump, int lengthSwim) {
		super(lengthRun, heightJump, lengthSwim);
	}

	@Override
	public void setRun(int lengthRun) {
		if (lengthRun <= 200) {
			System.out.println("The cat is run today: " + lengthRun + " meters.");
		} else {
			System.out.println("This cat can not run so much");
		}
	}

	@Override
	public void setJumpBarrier(double heightJump) {
		if (heightJump <= 2) {
			System.out.println("The cat is jumped: " + heightJump + " meters.");
		} else {
			System.out.println("This cat can not jump so high");
		}

	}

	@Override
	public void setSwim(int lengthSwim) {
	}

}
