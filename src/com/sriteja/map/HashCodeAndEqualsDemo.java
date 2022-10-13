package com.sriteja.map;

import com.sriteja.bean.Employee;

public class HashCodeAndEqualsDemo {

	public static void main(String args[]) {
		
		//Creating the Employee Object
		Employee emp1 = new Employee();
		emp1.setEmpId("I1232");
		emp1.setEmpName("Hari");
		
		Employee emp2 = new Employee();
		emp2.setEmpId("I1232");
		emp2.setEmpName("Hari");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		
	}
}
