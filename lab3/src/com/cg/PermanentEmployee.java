package com.cg;
class PermanentEmployee extends Employee3 {
	private String name;
	String joinDate;
	private double salary;
	public PermanentEmployee() {}
	public PermanentEmployee(String name, double salary, String joinDate)
	   {
		
		super(name, salary, joinDate);
	   	setName("name");
		setJoinDate("joinDate");
		
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
		// TODO Auto-generated method stub
		
	}
	public double getSalary() {
		return salary;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate=joinDate;
	}
	public String getJoinDate() {
		return joinDate;
	}
		
	
}

