package br.ufal.ic.p3.payroll.model;

public abstract class SalariedEmployee extends Employee{
	
	private float salary;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
