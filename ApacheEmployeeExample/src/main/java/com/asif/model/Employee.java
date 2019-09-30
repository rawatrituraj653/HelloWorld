package com.asif.model;

public class Employee {
 
	 private String name;
	 private String email;
	 private String address;
	 private String  salary;
	  
	public Employee() {
		super();
	}

	public Employee(String name, String email, String address, String salary) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary + "]";
	}
	
	 
}
