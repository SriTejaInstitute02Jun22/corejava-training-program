package com.sriteja.main;

import com.sriteja.bean.Employee;

public class EmployeeMain {

	
	private static String myName = "RameshBabu";
	
	//main method
	public static void main(String args[]) {
		
		//creating the Employee Object
		Employee employee = new Employee();  //Object_name variable_name = new Object_name();
		employee.setEmpName("Bala");
		employee.setEmpId("HCL_0001");
		employee.setEmpDept("IT");
		employee.setEmpSalary(90000.56);
		employee.setEmpJoiningDate("01-Jan-2022");
		employee.setEmpDeign("Sr.Software Engineer");
		
		//System.out.println("Display the Employee Details :: "+employee);
		System.out.println("Display the Employee Details");
		System.out.println(employee);
		
		System.out.println();
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Salary : "+employee.getEmpSalary());
		System.out.println();
		
		//Initializing Employee Object using Constructor
		/*Employee emp = new Employee("Naresh", "H002", "Admin", 95000, "01-Dec-21", "Sr.Admin Manager");
		System.out.println("Initializing Employee Object using Constructor");
		System.out.println("Employee Object : "+emp);*/
		
		
		MobileMain m = new MobileMain();
		m.setMobileDataWithSetterMethods();
	}
}


