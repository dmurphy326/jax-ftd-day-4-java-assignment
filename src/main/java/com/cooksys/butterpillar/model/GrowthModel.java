package com.cooksys.butterpillar.model;

public class GrowthModel {

	private double lengthToWingspan, leavesEatenToWeight;

	public double getLengthToWingspan() {
		return lengthToWingspan; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		double wingspan = butterpillar.getLength() * this.lengthToWingspan;
		double weight = butterpillar.getLeavesEaten() * this.leavesEatenToWeight;

		return new Catterfly(wingspan, weight);
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		double length = catterfly.getWingspan() / this.lengthToWingspan;
		double leavesEaten = catterfly.getWeight() / this.leavesEatenToWeight;

		return new Butterpillar(length, leavesEaten);
	}

	public boolean equals(GrowthModel g) {
		if (g.leavesEatenToWeight == this.leavesEatenToWeight && g.lengthToWingspan == this.lengthToWingspan) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}