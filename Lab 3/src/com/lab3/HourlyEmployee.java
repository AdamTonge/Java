package com.lab3;

public class HourlyEmployee extends Employee
{
	private double hoursWorked;
	private double hourlyRate;
	
	HourlyEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double hoursWorked,double hourlyRate)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.setHoursWorked(hoursWorked);
		this.setHourlyRate(hourlyRate);
	}
	
	public double calculatePay(double hoursWorked, double hourlyRate)
	{
		return (hoursWorked*hourlyRate);
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public String tostring()
	{		
		return super.toString() + ", hours is " + hoursWorked + ", hourly rate is " + hourlyRate;
	}
}
