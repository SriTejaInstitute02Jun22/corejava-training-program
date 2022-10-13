package com.sriteja.map;

import java.util.HashMap;
import java.util.Map;

import com.sriteja.bean.Employee;

public class MapExamples3 {

	public static void main(String args[]) {
		new MapExamples3().get();
		new MapExamples3().show();
	}

	private void get() {
		Map<String, String> m = new HashMap<>();
		m.put("B102", "Ramesh");
		m.put("C233", "Sam");
		m.put("D122", "Arun");
		m.put("C233", "Sundhar");
		m.put("B102", "Ramesh");

		System.out.println(m.size());

		for (Map.Entry<String, String> data : m.entrySet()) {
			System.out.println(data);
		}
	}

	private void show() {
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

		// insert the values into
		map.put(employee1, "1st Object");
		map.put(employee2, "2nd Object");
		map.put(employee3, "3rd Object");
		map.put(employee1, "5th Object");
		
		System.out.println(map.size());
		for (Map.Entry<Employee, String> m : map.entrySet()) {
			System.out.println(m);
		}
		
	}
}
