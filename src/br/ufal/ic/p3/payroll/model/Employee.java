package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

	private long id;
	private String name;
	private String address;
	private PaymentMethod paymentMethod;
	private List<Payroll> payrolls;

	public Employee() {
		payrolls = new ArrayList<Payroll>();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public long getId() {
		return id;
	}

}
