package com.lab4;

public class DepositAccount extends Account implements ValidatedAccount
{
	private double interestRate;
	
	
	DepositAccount(String accountName, int sortCode, String branchName, boolean inCredit, double acctBalance, double interestRate)
	{
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		this.interestRate = interestRate;
	}	
	
	
	public void withdraw()
	{
		System.out.println("You cannot withdraw from a deposit account");
	}	
	
	
	
	//getters and setters
	public double getInterestRate() 
	{
		return interestRate;
	}
	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
	
	public void getDetails()
	{
		System.out.println("This is a deposit account, the balance is " + getAcctBalance() + " and the account holder is " + getAccountName());
	}
	
	public void valuableAccount()
	{
		System.out.println("The account Balance is " + getAcctBalance());
	}
	
} //end DepositAccount class
