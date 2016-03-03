package com.lab5;

public class Job 
{
	private int salary;
	private String role;
	private int jobID;
	
	//constructer
	Job(int salary, String role, int jobID)
	{
		this.salary = salary;
		this.role = role;
		this.jobID = jobID;
	}
	
	//toString method to call class attributes
	public String toString()
	{
		return "Salary is " + salary + ". Role is " + role + ". JobID is " + jobID;
	}
	
	//getters and setters
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
}
