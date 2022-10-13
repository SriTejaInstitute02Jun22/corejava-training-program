package com.sriteja.bean;

public class Employee {

	//attribute
	private String empName;
	private String empId;
	private String empDept;
	private double empSalary;
	private String empJoiningDate;
	private String empDeign;
	
	//setter and getter method
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpJoiningDate() {
		return empJoiningDate;
	}

	public void setEmpJoiningDate(String empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}

	public String getEmpDeign() {
		return empDeign;
	}

	public void setEmpDeign(String empDeign) {
		this.empDeign = empDeign;
	}

	//toString method
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ ", empJoiningDate=" + empJoiningDate + ", empDeign=" + empDeign + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

	
		
	
}
