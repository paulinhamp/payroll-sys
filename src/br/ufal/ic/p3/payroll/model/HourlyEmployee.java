package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ana Paula
 *
 */
public class HourlyEmployee extends Employee {

	private float hourlySalary;
	private List<Timecard> timecards;

	public HourlyEmployee(String name, String address, PaymentMethod method, float hourlySalary) {
		super(name, address, method);
		this.hourlySalary = hourlySalary;
		timecards = new ArrayList<Timecard>();
	}

	public float getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(float hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public List<Timecard> getTimecards() {
		return timecards;
	}

	public void setTimecards(List<Timecard> timecards) {
		this.timecards = timecards;
	}

}
