package com.sriteja.map;

import java.util.HashMap;
import java.util.Map;

import com.sriteja.bean.Employee;

public class MapExamples2 {

	public static void main(String args[]) {
		new MapExamples2().getEmployeeDetails();
	}
	
	//creating the instance method
	public void getEmployeeDetails() {
		
		//creating the map object using key is Employee Object
		Map<Employee, String> map = new HashMap<>();
		
		Employee employee1 = new Employee();
		employee1.setEmpName("Chandra");
		employee1.setEmpId("C1221");
		employee1.setEmpDept("IT");
		employee1.setEmpSalary(50000.10);
		employee1.setEmpJoiningDate("01-Jan-22");
		employee1.setEmpDeign("Sr.Software Engineer");
		
		Employee employee2 = new Employee();
		employee2.setEmpName("Naresh");
		employee2.setEmpId("N9092");
		employee2.setEmpDept("IT");
		employee2.setEmpSalary(150000.00);
		employee2.setEmpJoiningDate("05-Dec-21");
		employee2.setEmpDeign("Team Lead");
		
		Employee employee3 = new Employee();
		employee3.setEmpName("Balu");
		employee3.setEmpId("B3221");
		employee3.setEmpDept("IT");
		employee3.setEmpSalary(100000.00);
		employee3.setEmpJoiningDate("05-Dec-21");
		employee3.setEmpDeign("Sr.Software Engineer");
		
		//insert the values into
		map.put(employee1, "1st Object");
		map.put(employee2, "2nd Object");
		map.put(employee3, "3rd Object");
		
		try {
			for(Map.Entry<Employee, String> data: map.entrySet()) {
				
				if(data.getKey().getEmpId().contains("B3221")) {
					System.out.println("This is Balu details");
					System.out.println(data);
					System.out.println();
				}else {
					System.out.println("I am not Balu");
					System.out.println(data.getKey());
				}
				
			}
		}catch(Exception ex) {
			System.out.println("Exception accured :: "+ex);
		}
		
	}
}
