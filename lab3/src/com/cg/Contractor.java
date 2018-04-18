package com.cg;

public class Contractor {
	private String name;
	public double rate;
	
	
	
	public Contractor(String name, double rate){
		this.name=name;
		this.rate=rate;
	}
	
	

	public Contractor() {

		// TODO Auto-generated constructor stub
	}



	public void setName(String name){
		this.name=name;
	
		}
	public String getName(){
		return name;
	}
	public void setRate(double rate){
		this.rate=rate;
		
	}
	
}
