package com.lab4;

public class Control {

	public static void main(String[] args)
	{
		
		//instances of the classes
		Account account1 = new Account("Adam Tonge", 2001, "Stillorgan", true, 10000.00);
		DepositAccount account2 = new DepositAccount("Eoin Mulvey", 2002, "Blackrock", true, 5000.00, 4.5);
		CurrentAccount account3 = new CurrentAccount("Andrew Cosgrave", 2003, "Dundrum", true, 2500.00, 150.00 );

		account1.deposit(200);
		account1.withdraw(100000);		
		
		account2.getDetails();
		account3.valuableAccount();
		account3.checkCredit();
	}

}
