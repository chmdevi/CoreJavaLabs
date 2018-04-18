package com.cg;

class contractEmployee extends Contractor {
	private static int noOfHours;
	private static int count;
	private Contractor contractor;
	private double salary;
	private String joinDate;
	
	 
	/*public contractEmployee()
		{
		super();
		count=count+1;
		}
	*/
	public contractEmployee() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public static int getNoOfHours() {
		return noOfHours;
	}

	public static void setNoOfHours(int noOfHours) {
		contractEmployee.noOfHours = noOfHours;
	}


	public double getSalary(int noOfHours){
	
		   salary = noOfHours * contractor.rate;
		   return salary;     
		}
	
	public void setContractor(Contractor c){
		this.contractor=c;
	}
	public Contractor getContractor(){
		return contractor;
	}

	public String getJoinDate() {
		
		return joinDate;
	}
	public void setJoinDate(String joinDate){
		this.joinDate=joinDate;
	}
}