package com.lab4;

public class CurrentAccount extends Account implements ValidatedAccount
{
	double penaltyAmount;
	
	CurrentAccount(String accountName, int sortCode, String branchName, boolean inCredit, double acctBalance, double penaltyAmount)
	{
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		this.penaltyAmount = penaltyAmount;
	}
	
	/*-	Has a withdraw method that overrides the Account withdraw – that checks if there is enough in the account to allow the 
	requested withdrawal. If the account balance is going to go below zero,
	it just prints out a message saying “Insufficient funds”.  NOTE: Be aware o
	f an error if your Account variables are “private”.  Look at the meaning of 
	“protected” for access level.*/
	
	public void withdraw(double withdrawal)
	{
		if(withdrawal > getAcctBalance())
		{
			System.out.println("Insufficent Funds");
		}
	}	
	
	public void checkCredit()
	{
		if(inCredit == true)
		{
			System.out.println("Account is in credit!!");
		}
		else
		{
			System.out.println("Account is not in credit!!");
		}
	}
	
	public void checkCredit(String warning)
	{
		if(getAcctBalance() > 0 && getAcctBalance() < 100)
		{
			System.out.println(warning);
		}
	}
	
	public void getDetails()
	{
		System.out.println("This is a current account, the balance is " + getAcctBalance() + " and the account holder is " + getAccountName());
	}
	
	public void valuableAccount()
	{
		System.out.println("The account Balance is " + getAcctBalance());
	}
} //end CurrentAccount class
