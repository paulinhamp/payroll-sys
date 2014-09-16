package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

public class HourlyEmployee extends Employee {

	private float hourlySalaried;
	private List<Timecard> timecards;

	public HourlyEmployee() {
		timecards = new ArrayList<Timecard>();
	}

	public float getHourlySalaried() {
		return hourlySalaried;
	}

	public void setHourlySalaried(float hourlySalaried) {
		this.hourlySalaried = hourlySalaried;
	}

	public List<Timecard> getTimecards() {
		return timecards;
	}

	public void setTimecards(List<Timecard> timecards) {
		this.timecards = timecards;
	}

}
