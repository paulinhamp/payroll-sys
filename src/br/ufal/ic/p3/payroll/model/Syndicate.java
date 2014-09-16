package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

public class Syndicate {
	
	private List<Employee> employees;
	
	public Syndicate() {
		employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
