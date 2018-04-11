package com.cg;

public class Class1 
{
	    public static void main(String[] args)
		{

	    	 Date doj  = new Date(15,06,2013); 
	    	 Employee emp = new Employee("Anvesh","Kumar",90000,"a1", doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	     	
	         doj  = new Date(13,9,2017);
	    	 emp = new Employee("Manisha","Cheernam",22000,"a5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(8,07,2011);
	    	 emp = new Employee("Chamu","S",22000,"a3",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(7,6,2014);
	    	 emp =  new Employee("Pragya","Joshi",23000,"a2",doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	    	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new Employee("Bindu","Y",27000,"b5",doj);
	 		 emp.displayentry();	
	 		 doj.displayDate();
	 		 
	    emp.displaycount();
	   }
	}


