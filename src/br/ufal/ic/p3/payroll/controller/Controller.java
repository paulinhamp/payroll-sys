package br.ufal.ic.p3.payroll.controller;

import br.ufal.ic.p3.payroll.model.CommissionedEmployee;
import br.ufal.ic.p3.payroll.model.Employee;
import br.ufal.ic.p3.payroll.model.HourlyEmployee;
import br.ufal.ic.p3.payroll.model.NonCommissionedEmployee;
import br.ufal.ic.p3.payroll.model.PaymentMethod;
import br.ufal.ic.p3.payroll.model.Syndicate;

public class Controller {
	
	public void addEmployee(String name, String address, PaymentMethod method, String type, float hourlySalary, float fixedSalary, float commission, float percentage){
		Employee employee = null;
		if(type.equals("hourly")){
			employee = new HourlyEmployee(name, address, method, hourlySalary);
		}else if(type.equals("commissioned")){
			employee = new CommissionedEmployee(name, address, method, fixedSalary, percentage);
		}else employee = new NonCommissionedEmployee(name, address, method, fixedSalary);
		
		if(employee != null){
			Syndicate.getInstance().getEmployees().add(employee);
		}
		
		employee.toString();
						
	}

}
