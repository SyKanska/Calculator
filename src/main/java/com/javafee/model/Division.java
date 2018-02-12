package com.javafee.model;

/**
 * The specific class based on calculation class.
 */
public class Division extends Calculation {
	@Override
	public Double calculate(Double firstVariable, Double seconVariable) {
		return firstVariable / seconVariable;
	}
	
	@Override
	public Double calculate(String firstVariable, String seconVariable) {
		// TODO Auto-generated method stub
		return super.calculate(firstVariable, seconVariable);
	}
	
	@Override
	public Double calculate(Double... values) {
		// TODO Auto-generated method stub
		return super.calculate(values);
	}
}