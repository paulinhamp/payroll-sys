package br.ufal.ic.p3.payroll.controller;

import java.util.Date;

import br.ufal.ic.p3.payroll.model.CommissionedEmployee;
import br.ufal.ic.p3.payroll.model.Employee;
import br.ufal.ic.p3.payroll.model.HourlyEmployee;
import br.ufal.ic.p3.payroll.model.NonCommissionedEmployee;
import br.ufal.ic.p3.payroll.model.PaymentMethod;
import br.ufal.ic.p3.payroll.model.Sale;
import br.ufal.ic.p3.payroll.model.Syndicate;
import br.ufal.ic.p3.payroll.model.Timecard;

/**
 * 
 * @author Ana Paula
 *
 */
public class Controller {

	private int i = 0;

	public void addEmployee(String name, String address, PaymentMethod method,
			String type, float hourlySalary, float fixedSalary, float percentage) {
		Employee employee = null;
		if (type.equals("hourly")) {
			employee = new HourlyEmployee(name, address, method, hourlySalary);
		} else if (type.equals("commissioned")) {
			employee = new CommissionedEmployee(name, address, method,
					fixedSalary, percentage);
		} else
			employee = new NonCommissionedEmployee(name, address, method,
					fixedSalary);

		if (employee != null) {
			employee.setId(i);
			Syndicate.getInstance().getEmployees().add(employee);
			i++;
		}
	}

	public Employee getEmployeeById(long id) {
		for (Employee employee : Syndicate.getInstance().getEmployees()) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	public void removeEmployee(long id) {
		Employee employee = getEmployeeById(id);
		if (employee != null) {
			Syndicate.getInstance().getEmployees().remove(employee);
		} else
			System.out.println("Employee not find!");
	}

	public void listEmployees() {
		for (Employee employee : Syndicate.getInstance().getEmployees()) {
			System.out.println(employee.getId() + " -- " + employee.getName());
		}
	}

	public void addTimeCard(long idEmployee, int hours, Date workedDay) {
		Timecard timecard = new Timecard(hours, workedDay);
		Employee employee = getEmployeeById(idEmployee);
		if (employee instanceof HourlyEmployee) {
			((HourlyEmployee) employee).getTimecards().add(timecard);
		}else System.out.println("Invalid employee");
	}

	public void addSale(int code, String description, float value, Date date, long idEmployee){
		Sale sale = new Sale(code, description, value, date);				
		Employee employee = getEmployeeById(idEmployee);
		if(employee instanceof CommissionedEmployee){
			((CommissionedEmployee)employee).getSales().add(sale);
		}else System.out.println("Invalid employee");
		
		
	}
	
}
