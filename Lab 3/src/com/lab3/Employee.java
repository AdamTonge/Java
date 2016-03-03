package com.lab3;

public class Employee 
{
	
	//Attributes 
	private String firstName;
	private String surName;
	private int staffNumber;
	private double baseAnnualSalary;
	private String startDate;
	
	
	//Constructer
	Employee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(staffNumber);
		this.setBaseAnnualSalary(baseAnnualSalary);
		this.setStartDate(startDate);
	}
	
	public double calculatePay(double baseAnnualSalary)
	{
		return (baseAnnualSalary/12);
	}

	String getFirstName() 
	{
		return firstName;
	}


	void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}


	String getSurName() 
	{
		return surName;
	}


	void setSurName(String surName) 
	{
		this.surName = surName;
	}


	int getStaffNumber() 
	{
		return staffNumber;
	}


	void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}


	double getBaseAnnualSalary() 
	{
		return baseAnnualSalary;
	}


	void setBaseAnnualSalary(double baseAnnualSalary) 
	{
		this.baseAnnualSalary = baseAnnualSalary;
	}


	String getStartDate() 
	{
		return startDate;
	}


	void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
	
	public String toString()
	{
		return("First name is " + firstName + ", Surname is " + surName + ", Staff number is " + staffNumber + ", base salary is " + baseAnnualSalary + ", start date is" + startDate);
		
	}
} //end employee class
