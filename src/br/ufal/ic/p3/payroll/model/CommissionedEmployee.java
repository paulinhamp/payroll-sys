package br.ufal.ic.p3.payroll.model;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends SalariedEmployee{
	
	private List<Sale> sales;
	
	public CommissionedEmployee() {
		sales = new ArrayList<Sale>();
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

}
