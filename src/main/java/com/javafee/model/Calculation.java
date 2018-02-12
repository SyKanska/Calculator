package com.javafee.model;

/**
 * The base class for specific calculation classes.
 */
public abstract class Calculation {
	private Double firstVariable = null;
	private Double secondVariable = null;
	
	public abstract Double calculate(Double firstVariable, Double seconVariable);
	
	public Double calculate(Double...values) {
		return null;
	}
	
	public Double calculate(String...values) {
		return null;
	}
	
	public Double calculate(String firstVariable, String seconVariable) {
		return null;
	}

	public Double getFirtVariable() {
		return firstVariable;
	}

	public void setFirtVariable(Double firtVariable) {
		this.firstVariable = firtVariable;
	}

	public Double getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(Double secondVariable) {
		this.secondVariable = secondVariable;
	}
}