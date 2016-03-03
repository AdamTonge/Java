package com.lab2;

/****************************************
*   Making a Animal class with different attributes 
*   Author: Adam Tonge
*   Date: 04/02/16
*****************************************/

public class Animal 
{
	private String name;
	private String breed;
	private int legs; //number of legs
	private Boolean domestic;
	private String colour;
	
	//constructer 1 
	public Animal(String name, String breed, int legs, Boolean domestic, String colour)
	{
		this.name = name;
		this.breed = breed;
		this.legs = legs;
		this.domestic = domestic;
		this.colour = colour;
		System.out.println(name +" " + breed + legs + domestic + colour);
	}
	
	//constructer 2 with intialised variables
	public Animal(String name)
	{
		this.name = "Leo";
		this.breed = "lion";
		this.legs = 4;
		this.domestic = false;
		this.colour = "yellow";
		System.out.println(name + breed + legs + domestic + colour);
	}
	
	//Setters
	public void setName (String name)  
	{
		this.name = name ; 		
	}
		
	public void setDomestic (boolean domestic)  
	{
		this.domestic = domestic ;  
	}
		
	public void setLegs (int legs)  
	{
		this.legs = legs ;  
	}
		
	public void setBreed (String breed)  
	{
		this.breed = breed ; 
	}
		
	public void setColor (String colour)  
	{
		this.colour = colour ;  
	}
		
	//getters
	public String getName ()  
	{
		 return name ;
	}
		
	public boolean getDomestic ()  
	{
		return domestic ; 
	}
		
	public int legs ()  
	{
		return legs ; 
	}
		
	public String getBreed ()  
	{
		return breed ;  			 
	}
		
	public String getColor ()  
	{
		 return colour ; 
	}
		
		
	//method called makeNoise 
	// if for different animals noises
	public void makeNoise()
	{
        if (breed.equals("dog")) 
        {
        	System.out.println("woof woof");
        } 
        
        else if (breed.equals("cat")) 
        {
        	System.out.println("meow, meow");
        }
        
        else if (breed.equals("lion")) 
        {
            System.out.println("roar, roar");
        }	
	} //end makeNoise()
	
	public void makeNoise(String volume)
	{
		if( volume.equals("loud"))
		{
			if (breed.equals("dog")) 
	        {
	        	System.out.println("WOOF WOOF");
	        } 
	        
	        else if (breed.equals("cat")) 
	        {
	        	System.out.println("MEOW");
	        }
	        
	        else if (breed.equals("lion")) 
	        {
	            System.out.println("ROAR");
	        }
		}
		else 
		{
			makeNoise();
		}	     
		
	}
}
	

