package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ana Paula
 *
 */
public class CommissionedEmployee extends SalariedEmployee {

	private List<Sale> sales;
	private float percentage;

	public CommissionedEmployee(String name, String address,
			PaymentMethod method, float salary, float percentage) {
		super(name, address, method, salary);
		sales = new ArrayList<Sale>();
		this.percentage = percentage;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
