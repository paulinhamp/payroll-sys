package br.ic.ufal.p3.payroll.view;

import br.ufal.ic.p3.payroll.controller.Controller;
import br.ufal.ic.p3.payroll.model.PaymentMethod;

public class Main {
	
	public static void main(String[] args) {
		Controller ct = new Controller();
		ct.addEmployee("Ana", "rua 15", PaymentMethod.DEPOSIT_ACCOUNT, "hourly", 100, 0, 0, 0);
	}

}
