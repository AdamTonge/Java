package lab1;

/****************************************
*   Main function
*   Author: Adam Tonge
*   Date: 28/01/16
*****************************************/

public class Control 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HelloWorld myhello = new HelloWorld();//creates object of class called myhello		
		myhello.print(); //calls method print from object myhello	
		
		Vehicle owner1 = new Vehicle(); //creating object owner1
		owner1.VehicleOne("Adam",678, 50, "blue");
		
		Vehicle owner2 = new Vehicle(); //creating object owner2
		owner2.VehicleTwo();
		
		Vehicle stringtest = new Vehicle();
		stringtest.toString();
		System.out.println(stringtest);
	}
	

}
