package br.ufal.ic.p3.payroll.model;

public class NonCommissionedEmployee extends SalariedEmployee{

	public NonCommissionedEmployee(String name, String address,
			PaymentMethod method, float salary) {
		super(name, address, method, salary);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
