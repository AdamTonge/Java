package com.lab5;

public class Control 
{
	public static void main(String[] args)
	{
		Date test1 = new Date(12,12,1212);
		System.out.println(test1.toString());
	
		Job test2 = new Job(1000, "Manager", 10);
		System.out.println(test2.toString());
		
		Person test3 = new Person("Adam", "Tonge", test1 , "Male");
		System.out.println(test3.toString());
		
		Date myStartDate = new Date(25,02,2016);
		Employee test4 = new Employee("April", "Tan", test1 ,"Female", test2, myStartDate, 10);
		System.out.println(test4.toString());
		
		
	}
}
