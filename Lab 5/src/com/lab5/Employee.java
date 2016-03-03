package com.lab5;

public class Employee extends Person
{
	private Job job;
	static protected int personnelNumber  = 0;
	private Date startDate;
	
	// Employee constructor 
	Employee(String firstName, String surName, Date dob, String gender, Job job, Date startDate, int personnelNumber)
	{
		super(firstName, surName, dob, gender);
		this.job = job;
		this.startDate = startDate;
		setPersonnelNumber();
		
	}
		
	public String toString()
	{
		return "Job is " + job + ". Personnel number is " + personnelNumber + ". The start date is " + startDate;
	}
	
	
	
	
	//getters and setters
	public int getPersonnelNumber()
	{
		return personnelNumber;
	}
	public void setPersonnelNumber()
	{
		Employee.personnelNumber += 1;
		
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
}
