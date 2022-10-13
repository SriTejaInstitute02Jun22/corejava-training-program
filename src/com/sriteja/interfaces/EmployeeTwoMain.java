package com.sriteja.interfaces;

import com.sriteja.bean.Employee;

public class EmployeeTwoMain {

	public static void main(String args[]) {
		
		EmployeeInterface e1 =  new EmployeeTwo();
		
		Employee emp = e1.getEmployeeDetails();
		System.out.println(emp);
		
		e1.getEmployeeOfficeAddress();
		EmployeeInterface.getEmpCompanyName();
		
	}
}
