package eTask2;

import java.util.Scanner;

public class EmployeeApp  {

	public static void main(String[] args) {
		try {
		
		Employee emp1=new Employee(111,3);
	    System.out.println("Enter the Employee id:"+emp1.getIdNo()+"\n\n Enter the Hourly Wages of the Employee:"+emp1.getHourlyWage());
	    emp1.setIdNo(111);
	    emp1.setHourlyWage(3);
		}
		catch(EmployeeException e)
		{
			System.out.println(e.toString());
		}
			try
			{
				Employee emp2=new Employee(112,32);
				System.out.println("==================================");
				System.out.println("Enter the Employee id:"+emp2.getIdNo()+"\n\n Enter the Hourly Wages of the Employee:"+emp2.getHourlyWage());
				emp2.setHourlyWage(32);
			}
			catch(EmployeeException e)
			{
				System.out.println(e.toString());
			}
			try
			{
				Employee emp3=new Employee(113,69);
				System.out.println("==================================");
				System.out.println("Enter the Employee id:"+emp3.getIdNo()+"\n\n Enter the Hourly Wages of the Employee:"+emp3.getHourlyWage());
				emp3.setHourlyWage(69);
			}
			catch(EmployeeException e)
			{
				System.out.println(e.toString());
			}
			
		
	}//end of main

}//end of class
