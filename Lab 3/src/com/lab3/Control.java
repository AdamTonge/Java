package com.lab3;

public class Control {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee("Eoin", "Mulvey", 69, 200000, "11-02-16");
		HourlyEmployee employee2 = new HourlyEmployee("Andrew", "Cosgrave", 70, 0, "01-01-16", 400, 7.60);
		CommissionEmployee employee3 = new CommissionEmployee("Adam", "Tonge", 71, 10000, "15-01-16", 25000);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.tostring());
		System.out.println(employee3.toString());
		
		/*
		
		myEmployee[0] = new Employee();
		myEmployee[1] = new Employee();
		myEmployee[2] = new HourlyEmployee();
		myEmployee[3] = new HourlyEmployee();
		myEmployee[4] = new CommissionEmployee();
		myEmployee[5] = new CommissionEmployee();
		
		int i = 0
				
		//loop to call array
		for (i = 0; i ++; i < 6)
		{		
			System.out.println(employees[i].calculatePay());
		}*/
		
				
	}
	
}
