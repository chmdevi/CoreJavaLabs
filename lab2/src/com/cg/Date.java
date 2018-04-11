package com.cg;


public class Date 
{
	private int day, month, year;
	
public Date(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}
public void displayDate()
{
	System.out.println("Date of joining is :" +day+"/"+month+"/" +year);
}
}