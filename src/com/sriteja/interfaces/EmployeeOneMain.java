package com.sriteja.interfaces;

import com.sriteja.bean.Employee;

public class EmployeeOneMain {

	public static void main(String args[]) {
		
		EmployeeInterface emp = new EmployeeOne();
		
		Employee employee = emp.getEmployeeDetails();
		System.out.println(employee);
		
		//emp.getEmployeeDetails();
		emp.getEmployeeOfficeAddress();
		
		EmployeeInterface.getEmpCompanyName();
		
		
	}
}
