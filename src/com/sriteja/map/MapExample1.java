package com.sriteja.map;

import java.util.HashMap;
import java.util.Map;

import com.sriteja.bean.Employee;

public class MapExample1 {

	Map<String, Employee> employeeMap1; //Object variable declaration
	Map<String, Employee> employeeMap;
	
	//creating the main method
	public static void main(String args[]) {
		new MapExample1().getDetails();
		System.out.println("======================");
		new MapExample1().getEmployDetails();
		new MapExample1().getEmpData();
	}
	//instance method
	private void getDetails() {
		
		//Creating the map Object
		Map<Integer, String> empDetails = new HashMap<>();
		empDetails.put(2020, "Chandra");
		empDetails.put(3021, "Balu");
		empDetails.put(2011, "Ram");
		empDetails.put(8383, "Pandu");
		empDetails.put(null, "Naresh");
		
		for(Map.Entry<Integer, String> empData :empDetails.entrySet()) {
			System.out.println(empData);
		}
	}
	
	//instance method with custom Object as a value
	private void getEmployDetails() {
		
		//creating the map Object value as a Employee Object
		employeeMap = new HashMap<>();
		
		//Employee Objects
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
		
		//To set the values into the map object
		employeeMap.put("N9092", employee2);
		employeeMap.put("B3221", employee3);
		employeeMap.put("C1221", employee1);
		
		try {
			if(!employeeMap.isEmpty() && employeeMap != null) {
				
				for(Map.Entry<String, Employee> emp : employeeMap.entrySet()) {
					System.out.println(emp);
				}
			}else {
				System.out.println("Map Object is null or empty");
			}
			
		}catch(Exception ex) {
			System.out.println("Map Object not available");
			System.out.println("=========="+ex);
		}
		
		
	}
	
	//below code is using to test the exception case
	private void getEmpData() {
		System.out.println();
		//creating the map Object value as a Employee Object
			//	Map<String, Employee> employeeMap = new HashMap<>();
				
				//Employee Objects
				Employee employee1 = new Employee();
				employee1.setEmpName("Chandra");
				employee1.setEmpId("C1221");
				employee1.setEmpDept("IT");
				employee1.setEmpSalary(50000.10);
				employee1.setEmpJoiningDate("01-Jan-22");
				employee1.setEmpDeign("Sr.Software Engineer");
				
				//To set the values into the map object
				//employeeMap1.put("C1221", employee1);
				
				
				try {
					if(!employeeMap1.isEmpty() && employeeMap1 != null) {
						
						for(Map.Entry<String, Employee> emp : employeeMap1.entrySet()) {
							System.out.println(emp);
						}
					}else {
						System.out.println("Map Object is null or empty");
					}
					
				}catch(Exception ex) {
					System.out.println("Map Object not available");
					System.out.println("=========="+ex);
				}
				
				
			}
}
	

