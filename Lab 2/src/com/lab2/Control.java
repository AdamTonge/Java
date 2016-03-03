package com.lab2;

/****************************************
*   Main Function
*   Author: Adam Tonge
*   Date: 04/02/16
*****************************************/

public class Control 
{

	public static void main(String[] args) 
	{
		
		String volume = "quiet";
		Animal animal1 = new Animal("Spot","dog", 4, true, "brown");
						
		Animal animal2 = new Animal(); //instance of object
		
		//to call when private
		//System.out.println(animal2.name);
		//System.out.println(animal2.domestic);
		//System.out.println(animal2.legs);		
		
		// calling private objects with getter/setter
		animal2.setColor("brown");
		System.out.println(animal2.getColor());
				
		//call methods		
		animal2.makeNoise(volume);
		
	}

}
