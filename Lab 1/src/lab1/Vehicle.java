package lab1;

/****************************************
*   Making a vehicle class with different attributes 
*   Author: Adam Tonge
*   Date: 28/01/16
*****************************************/


public class Vehicle 
{
	String ownerName;
	int regNum;
	int maxSpeed;
	String colour;
	
	public void VehicleOne(String ownerName, int regNum, int maxSpeed, String colour)
	{
		this.ownerName = ownerName;
		this.regNum = regNum;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		System.out.println("name is: " + ownerName + " Reg: " + regNum + " Max speed: " + maxSpeed + " Colour: " + colour);
	}
	
	public void VehicleTwo() //2 nd constructor with values intiated 
	{
		this.ownerName = "Jim";
		this.regNum =  876;
		this.maxSpeed = 100;
		this.colour = "red";
		System.out.println("name is: " + this.ownerName + " Reg: " + this.regNum + " Max speed: " + this.maxSpeed + " Colour: " + this.colour);
	}
	
	public String toString() // toString method 
	{
		String content;
		content = ("Name: " + ownerName + " Reg:" + regNum + " Speed:" + maxSpeed + " Colour:" + colour);
		return content;
	}
} // end class
