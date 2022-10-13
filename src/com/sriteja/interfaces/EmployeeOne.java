package com.sriteja.interfaces;

import com.sriteja.bean.Employee;

public class EmployeeOne implements EmployeeInterface{

	@Override
	public Employee getEmployeeDetails() {
		
		//creating the Employee Object
		Employee employee = new Employee();
		employee.setEmpName("Chandra");
		employee.setEmpId("E1234");
		employee.setEmpDept("IT");
		employee.setEmpSalary(150000.2);
		employee.setEmpJoiningDate("01-Jan-2022");
		employee.setEmpDeign("Tech Lead");
		
		return employee;
		
	}

	
}
