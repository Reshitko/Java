package com.homework_to_lesson_5;

/**
 * Homework:5 
 * 8/24/2020
 * @author Reshitko Ruslan
 *
 */
public class Dog extends Animal {

	public Dog(int lengthRun, double heightJump, int lengthSwim) {
		super(lengthRun, heightJump, lengthSwim);
	}

	@Override
	public void setRun(int lengthRun) {
		if (lengthRun <= 600) {
			System.out.println("The dog is run: " + lengthRun + " meters.");
		} else {
			System.out.println("This dog can not run so much");
		}
	}

	@Override
	public void setJumpBarrier(double heightJump) {
		if (heightJump <= 0.5) {
			System.out.println("The dog is jumped: " + heightJump + " meters.");
		} else {
			System.out.println("This dog can not jump so high");
		}

	}

	@Override
	public void setSwim(int lengthSwim) {
		if (lengthSwim <= 10) {
			System.out.println("The dog is swum: " + lengthSwim + " meters.");
		} else {
			System.out.println("This dog can not swim that far");
		}

	}

}
