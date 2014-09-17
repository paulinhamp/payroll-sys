package br.ufal.ic.p3.payroll.model;

/**
 * 
 * @author Ana Paula
 *
 */
public abstract class SalariedEmployee extends Employee{
	
	private float salary;
	
	public SalariedEmployee(String name, String address, PaymentMethod method, float salary) {
		super(name, address, method);
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
