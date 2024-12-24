package com.sample.java.practice;

public class Employee {
	
	String empName;
	static int empSalary;
	String empId;
	
	public Employee(String empName, int empSalary, String empId) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	public static int empSalary(int empSalary) {
		Employee.empSalary=empSalary;
		
		return Employee.empSalary;
	}
	
	public final int empSalaryPlusBonus(int empSalary) {
		
		return empSalary;
	}

}
