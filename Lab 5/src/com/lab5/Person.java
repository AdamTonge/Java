package com.lab5;

public class Person
{
	private String firstName;
	private String surName;
	private Date dob;
	private String gender;
	
	Person(String firstName, String surName, Date dob, String gender)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setDob(dob);
		this.setGender(gender);
	}
	
	
	

	//toString method to write out class attributes
	public String toString()
	{
		return "First name is " + firstName + ". Surname is " + surName + ". Date of birth is " + dob + ". The gender is " + gender;
	}
	
	
	
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
