package com.lab3;

public class CommissionEmployee extends Employee
{
	double commissionEarned;
	
	CommissionEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double commissionEarned)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.commissionEarned = commissionEarned;
	}
	
	public double calculatePay(double baseAnnualSalary, double commissionEarned)
	{
		return(baseAnnualSalary/12 + commissionEarned);
	}
	
	public String toString()
	{
		return super.toString() + ", comission is" + commissionEarned;
	}
}
