package com.sriteja.immutable;

//rule 1: class is a final
public final class EmployeeImmutable {

	//data members or attribute
	//rule 2: all data members are private
	private int empID; 
	private String empName;
	private String empJoiningDate;
	private String empEndDate;
	
	//rule 3: parameterized constructor 
	public EmployeeImmutable(int empID, String empName, String empJoiningDate, String empEndDate) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empJoiningDate = empJoiningDate;
		this.empEndDate = empEndDate;
	}


	//rule 4: it contain all getter method only
	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpJoiningDate() {
		return empJoiningDate;
	}

	public String getEmpEndDate() {
		return empEndDate;
	}
	
		
}
