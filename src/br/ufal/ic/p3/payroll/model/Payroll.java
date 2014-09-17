package br.ufal.ic.p3.payroll.model;

public class Payroll {
	
	private Employee employee;
	
	public Payroll(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
