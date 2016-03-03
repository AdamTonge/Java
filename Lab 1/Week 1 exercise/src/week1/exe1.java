package week1;

import java.util.Scanner;

public class exe1 
{
	public void even()
	{
		Scanner exe1 = new Scanner(System.in);
		
		int a;
		System.out.println("Enter in a number to test if odd or even:");
		a = exe1.nextInt();	
		
		
		if ( a % 2 ==  0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
		exe1.close();
	}
	 	  
 	
	
}
