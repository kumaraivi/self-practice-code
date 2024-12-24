package com.test.employee;

public class Employee implements Comparable<Employee>{
	
	String name;
	Integer salary;
	
	Employee(){
		
	}
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return o.salary.compareTo(this.salary);
	}

}
