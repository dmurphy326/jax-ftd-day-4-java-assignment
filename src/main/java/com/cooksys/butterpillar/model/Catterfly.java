package com.cooksys.butterpillar.model;

public class Catterfly {
	
	private double wingspan, weight;
	
	public Catterfly()
	{
		
	}
	
	public Catterfly(double wingspan, double weight)
	{
		setWingspan(wingspan);
		setWeight(weight);
	}

	public double getWingspan() {
		return wingspan; // to be implemented
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public double getWeight() {
		return weight; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean equals(Catterfly c) {
		if(this.wingspan == c.wingspan && this.weight == c.weight)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Catterfly: " + this.wingspan + ", " + this.weight; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}