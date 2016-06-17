package com.cooksys.butterpillar.model;

public class Butterpillar {

	private double length, leavesEaten;

	public Butterpillar() {

	}

	public Butterpillar(double length, double leavesEaten) {
		setLength(length);
		setLeavesEaten(leavesEaten);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}

	public boolean equals(Butterpillar b) {
		if (this.length == b.length && this.leavesEaten == b.leavesEaten) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Butterpillar: " + this.length + ", " + this.leavesEaten;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}

}