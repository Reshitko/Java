package com.homework_to_lesson_5;

/**
 * Homework:5
 * 8/24/2020
 * @author Reshitko Ruslan
 *
 */
public abstract class Animal {

	protected int lengthRun;
	protected double heightJump;
	protected int lengthSwim;

	public Animal(int lengthRun, double heightJump, int lengthSwim) {
		this.lengthRun = lengthRun;
		this.heightJump = heightJump;
		this.lengthSwim = lengthSwim;

	}

	public abstract void setRun(int lengthRun);

	public int getLengthRun(int lengthRun) {
		return lengthRun;
	}

	public abstract void setJumpBarrier(double heightJump);

	public abstract void setSwim(int lengthSwim);

}
