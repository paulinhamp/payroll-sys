package br.ic.ufal.p3.payroll.view;

import java.util.Date;

import br.ufal.ic.p3.payroll.controller.Controller;
import br.ufal.ic.p3.payroll.model.HourlyEmployee;
import br.ufal.ic.p3.payroll.model.PaymentMethod;

/**
 * 
 * @author Ana Paula
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Controller ct = new Controller();
		ct.addEmployee("Ana", "rua 15", PaymentMethod.DEPOSIT_ACCOUNT, "hourly", 100,  0, 0);
		ct.addEmployee("Paula", "rua 15", PaymentMethod.DEPOSIT_ACCOUNT, "commissioned", 0, 100, 5);
		ct.addEmployee("Maria", "rua 15", PaymentMethod.DEPOSIT_ACCOUNT, "non-commissioned", 0, 100, 0);
		ct.listEmployees();
		ct.removeEmployee(1);
		ct.listEmployees();
		System.out.println("--\n");
		ct.addTimeCard(0, 8, new Date());
		System.out.println(((HourlyEmployee)ct.getEmployeeById(0)).getTimecards().get(0).getHours());
		
		

	}

}
