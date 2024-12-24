package com.sample.java.practice;

public class ITEngineer extends Employee {

	public ITEngineer(String empName, int empSalary, String empId) {
		super(empName, empSalary, empId);
		// TODO Auto-generated constructor stub
	}

	public static int empSalary(int empSalary) {
		Employee.empSalary=empSalary;
		
		return Employee.empSalary+100;
	}
	
	

}
