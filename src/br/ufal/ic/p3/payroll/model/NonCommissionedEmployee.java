package br.ufal.ic.p3.payroll.model;

/**
 * 
 * @author Ana Paula
 *
 */
public class NonCommissionedEmployee extends SalariedEmployee{

	public NonCommissionedEmployee(String name, String address,
			PaymentMethod method, float salary) {
		super(name, address, method, salary);
	}
	
}
