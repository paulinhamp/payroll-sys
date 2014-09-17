package br.ufal.ic.p3.payroll.model;

/**
 * 
 * @author Ana Paula
 *
 */
public abstract class Employee {

	private long id;
	private String name;
	private String address;
	private PaymentMethod paymentMethod;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, PaymentMethod paymentMethod) {
		super();
		this.name = name;
		this.address = address;
		this.paymentMethod = paymentMethod;
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
	
	public void setId(long id){
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "test --> " + id + " " + getName();
	}
}
