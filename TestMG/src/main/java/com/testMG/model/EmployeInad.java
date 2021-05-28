package com.testMG.model;

public class EmployeInad extends Employe{
	private double AnualSalary;

	public double getAnualSalary() {
		return AnualSalary;
	}

	public void setAnualSalary(double anualSalary) {
		AnualSalary = anualSalary;
	}

	public EmployeInad() {
		super();
		AnualSalary = 0;
	}
}
