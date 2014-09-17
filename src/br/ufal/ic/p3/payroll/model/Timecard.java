package br.ufal.ic.p3.payroll.model;

import java.util.Date;

/**
 * 
 * @author Ana Paula
 *
 */
public class Timecard {

	private int hours;
	private Date workedDay;

	public Timecard(int hours, Date workedDay) {
		this.hours = hours;
		this.workedDay = workedDay;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Date getWorkedDay() {
		return workedDay;
	}

	public void setWorkedDay(Date workedDay) {
		this.workedDay = workedDay;
	}

}
