package com.cg;
public class Employee3 {
	private String name;
	private double salary;
	private Date joinDate;
	private static int count;
	
	PermanentEmployee permanentEmployee;
	private contractEmployee contractEmployee;
	public Employee3() {}
	public Employee3(String name, double salary, String joinDate) { 
		 setName(name);
		 setPermanentEmployee(permanentEmployee);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
		
	public void setPermanentEmployee(PermanentEmployee p) {
		this.permanentEmployee = p;
	}
	public PermanentEmployee getPermanentEmployee() {
		return permanentEmployee;
	}
	public void setContractEmployee(contractEmployee conEmp) {
		this.contractEmployee = conEmp;
	}
	public contractEmployee getContractEmployee(){
		return contractEmployee;
		
	}
	public void setSalary(double salary) {
		this.salary=salary;
		// TODO Auto-generated method stub
		
	}
	public double getSalary() {
		return salary;
	}
	
	}
