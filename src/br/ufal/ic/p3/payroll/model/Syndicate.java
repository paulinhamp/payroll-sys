package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

public class Syndicate {

	private static Syndicate syndicate = null;

	private List<Employee> employees;

	private Syndicate() {
		syndicate = new Syndicate();
		employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public static Syndicate getInstance() {
		if (syndicate == null) {
			syndicate = new Syndicate();
		}
		return syndicate;
	}

}
