package com.test.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeTestClass {

	public static void main(String[] args) {
	
		 Employee emp1 = new Employee("ank", 2000);
         Employee emp2 = new Employee("dav", 500);
         Employee emp3 = new Employee("ank", 1000);
         Employee emp4 = new Employee("sam", 9000);
         Employee emp5 = new Employee("ank", 1000);

         List<Employee> l1 = new ArrayList<Employee>();
         List<Employee> l2 = new ArrayList<Employee>();
         List<Employee> l3 = new ArrayList<Employee>();
         l1.add(emp1);
         l1.add(emp2);
         l1.add(emp3);
         l1.add(emp4);
         l1.add(emp5);
         l2.add(emp3);
         l2.add(emp4);
         l3.add(emp5);
         
         Collections.sort(l1);
         for(Employee e:l1) {
        	 System.out.println(e.name+" "+e.salary);
         }
         
         System.out.println("\n----------------------\n");
         
         for(Employee e:l2) {
        	 System.out.println(e.name+" "+e.salary);
         }
         
         System.out.println("\n----------------------\n");
         
         for(Employee e:l3) {
        	 System.out.println(e.name+" "+e.salary);
         }
         
         System.out.println("\n----------------------\n");
         
         Map<Integer, List<Employee>> map=new TreeMap<>();
         map.put(1, l1);
         map.put(2, l2);
         map.put(3, l3);
          Set<Integer> i=map.keySet();
         for(Integer empe:i) {
        	
        	List<Employee> emps=map.get(empe.intValue());
        	System.out.print(empe.intValue());
        	for(Employee emp:emps) {
        		System.out.print(" " +emp.name+" "+emp.salary);
        		System.out.println("");
        	}
        		 
        	 }
        	 
         }

         

	}


