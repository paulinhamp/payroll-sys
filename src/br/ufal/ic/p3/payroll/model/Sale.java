package br.ufal.ic.p3.payroll.model;

import java.util.Date;

/**
 * 
 * @author Ana Paula
 *
 */
public class Sale {
	
	private int code;
	private String description;
	private float value;
	private Date date;
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}
	

	public Sale(int code, String description, float value, Date date) {
		super();
		this.code = code;
		this.description = description;
		this.value = value;
		this.date = date;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
