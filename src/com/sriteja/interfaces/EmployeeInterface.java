package com.sriteja.interfaces;

import com.sriteja.bean.Employee;

public interface EmployeeInterface {

	public Employee getEmployeeDetails();
	
	default void getEmployeeOfficeAddress() {
		System.out.println("1-23/12, Whitefield, Bangalore");
	}
	
	static void getEmpCompanyName() {
		System.out.println("Employee Company Name is Capgemin");
	}
}
