package com.sriteja.interfaces;

import com.sriteja.bean.Employee;

public class EmployeeTwo implements EmployeeInterface{

	@Override
	public Employee getEmployeeDetails() {
		
		Employee emp = new Employee();
		emp.setEmpName("Balu");
		emp.setEmpId("B2222");
		emp.setEmpDept("IT");
		emp.setEmpSalary(100000.0);
		emp.setEmpJoiningDate("01-Dec-2021");
		emp.setEmpDeign("Sr.Software Engineer");
		
		return emp;
	}
}
