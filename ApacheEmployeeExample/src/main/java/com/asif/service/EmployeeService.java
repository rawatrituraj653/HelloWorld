package com.asif.service;

import java.util.ArrayList;
import java.util.List;

import com.asif.model.Employee;

public class EmployeeService {

	     public  List<Employee>  getEmployeeDetail()
	     {
	    	  
	    	   List<Employee>  employeeList= new ArrayList<Employee>();
	    	   employeeList.add(new Employee("asif", "asifraza2099@gmail.com", "gaya", "1000.0"));
	    	   employeeList.add(new Employee("danish", "danish@gmail.com", "gaya","4000.0"));
	    	   employeeList.add(new Employee("irfan", "irfan@gmail.com", "patna", "3000.0"));
	    	   employeeList.add(new Employee("arshad","arshad@gmail.com","delhi", "8000.0"));
	    	   return employeeList;
	    	   
	    	   
	     }
}
