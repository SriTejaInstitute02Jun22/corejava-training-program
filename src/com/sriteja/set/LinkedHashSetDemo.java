package com.sriteja.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sriteja.bean.Employee;

/**
 * This Class is using to implement the Set interface using LinkedHashSet class.
 * LinkedHashSet:-  While adding the element into LinkedHashSet, is insertion
 * order must be follow and duplicate elements are not allowed.
 */
public class LinkedHashSetDemo {

	public static void main(String args[]) {
		// LinkedHashSetDemo.setEmployDetails();
		setEmployDetails();
		m1();
		m2();
	}

	// static method cration
	public static void setEmployDetails() {

		// create the Set Object using LinkedHashSet
		Set<Employee> employees = new LinkedHashSet<>();

		// Employee Object creation
		Employee emp1 = new Employee();
		emp1.setEmpName("Ramu");
		emp1.setEmpId("E1233");
		emp1.setEmpDept("IT");
		emp1.setEmpSalary(30000.0d);
		emp1.setEmpJoiningDate("10-Aug-22");
		emp1.setEmpDeign("Software Engineer");

		Employee emp2 = new Employee();
		emp1.setEmpName("Mani");
		emp1.setEmpId("E123");
		emp1.setEmpDept("IT");
		emp1.setEmpSalary(35000.0d);
		emp1.setEmpJoiningDate("11-Aug-22");
		emp1.setEmpDeign("Software Engineer");

		Employee emp3 = new Employee();
		emp1.setEmpName("Mani");
		emp1.setEmpId("E123");
		emp1.setEmpDept("IT");
		emp1.setEmpSalary(35000.0d);
		emp1.setEmpJoiningDate("11-Aug-22");
		emp1.setEmpDeign("Software Engineer");

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		for (Employee emp : employees) {
			System.out.println("Employee details :: " + emp);
		}

	}

	public static void m1() {

		Set<String> names = new LinkedHashSet<String>();
		names.add("Ram");
		names.add("Rahim");
		names.add("Mani");
		names.add("Pandu");
		names.add("Ram");

		for (String name : names) {
			System.out.println("Name :: " + name);
		}
	}

	//TreeSet
	public static void m2() {
		System.out.println();
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(93);
		numbers.add(84);
		numbers.add(3);
		numbers.add(10);
		numbers.add(70);
		numbers.add(3);

		for (Integer name : numbers) {
			System.out.println("Name :: " + name);
		}
	}
}
