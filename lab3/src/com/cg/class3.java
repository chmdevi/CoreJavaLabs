package com.cg;

public class class3 {
	public static void main(String args[]) {
		int count = 1000;
		count= count++;
		Employee3[] e = new Employee3[2];
		PermanentEmployee[] p = new PermanentEmployee[2];
		contractEmployee[] conEmp = new contractEmployee[2];
		Contractor[] c = new Contractor[2];

		for(int i=0; i<2; i++) {
			e[i] = new Employee3();
			p[i] = new PermanentEmployee();
			conEmp[i] = new contractEmployee();
			c[i] = new Contractor();
		}	
	e[0].setName("Manisha");
	 e[1].setName("Vasavi");
	 p[0].setSalary(25000.00);
	 p[1].setSalary(90000.00);
	 p[0].setJoinDate("30-Jul-2018");
	 p[1].setJoinDate("05-Nov-2018");
	 c[0].setRate(450);
	conEmp[0].setName("Satya");
	 conEmp[1].setName("Lakshmi");
	 conEmp[0].setNoOfHours(15);
	conEmp[0].setJoinDate("29-May-2010");
	conEmp[1].setJoinDate("13-Aug-2006");
	
	for(int i=0; i<2; i++) {
		 e[i].setPermanentEmployee(p[i]);
		 e[i].setContractEmployee(conEmp[i]);
		 conEmp[i].setContractor(c[i]);
		 conEmp[i].getContractor();
		 
		 System.out.println("Permanent Employee details :");
		 System.out.println("                            ");
		 System.out.println("Employee no is              		:" +count++);
		 System.out.println("Employee name is            		:" +e[i].getName());
		 System.out.println("Employee Salary is 		        :" +e[i].getPermanentEmployee().getSalary());
		/* System.out.println("permanent employee salary is       :" +p[i].getSalary()); */
		 System.out.println("Employee joining date is  is       :" +e[i].getPermanentEmployee().getJoinDate());
		 System.out.println("                            ");
		 System.out.println("contract Employee details  :");
		 System.out.println("                            ");
		 System.out.println("Employee no is            	        :" +count++);
		 System.out.println("Employee name is                   :" +e[i].getContractEmployee().getName());
		 //System.out.println("Employee salary  is                :" +e[i].getContractEmployee().getSalary());
		 System.out.println("Employee date of joining is        :" +e[i].getContractEmployee().getJoinDate());
		 System.out.println("---------------------------------------------------------------------------------------------");
		 

	 }

 }
}


