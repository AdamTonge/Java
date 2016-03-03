package com.lab5;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	//constructer
	Date(int day, int month, int year)
	{
		if(day < 31 && day > 0)
		{
			this.day = day;
		}
		if(month < 13 && month > 0)
		{	
			this.month = month;
		}
		this.year = year;
		
	}	
	
	//toString method to write out class attributes
	public String toString()
	{
		return "Day is "+ day + ". Month is " + month + ". Year is" + year;
	}
	
	//getters and setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
