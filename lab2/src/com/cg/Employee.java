package com.cg;

public class Employee
{
	private String fname;
	private String lname;
	private double sal;
	private String grade;
	private static int idcount;
	 Date dateofjoining;
	
	
	
	
	public Employee(String fname,String lname,double sal,String grade,Date dateofjoining)
	{
		this.fname = fname;
		this.lname = lname;
		this.sal   = sal;
		this.grade = grade;
		this.dateofjoining = dateofjoining;
	 ++idcount;
	}
	public void displayentry()
	{
		   System.out.println("******************************************");
		   System.out.println("Employee ID   : "+idcount);	
           System.out.println("First Name    : "+fname);
           System.out.println("Last  Name    : "+lname);
           System.out.println("Salary        : "+sal);
           System.out.println("Grade         : "+grade);
           System.out.println("******************************************");
	}
	public void displaycount()
	{
		   System.out.println("Total entries present : "+idcount);	
		
	}
	
} 
