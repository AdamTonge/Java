package com.lab4;

public class Account implements ValidatedAccount
{
	private String accountName;
	static protected int accountNumber = 0;
	private int sortCode;
	private String branchName;
	protected boolean inCredit;
	protected double acctBalance;
	
	//constructer
	Account(String accountName, int sortCode, String branchName, boolean inCredit, double acctBalance)
	{
		this.accountName = accountName;		
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;
		setAccountNumber() ; 
		
		System.out.println("The account number is " + accountNumber);
	}
	
	
	//takes in amount and adds to accBalance
	public void deposit(double amountDeposited)
	{
		double balance = amountDeposited + getAcctBalance();
		setAcctBalance(balance);
		System.out.println(balance);
	}
	
	//takes in amount and substracts it from accBalance
	public void withdraw(double amountDeposited)
	{
		double balance = getAcctBalance() - amountDeposited;
		if(balance < 0)
		{
			inCredit = false;
			System.out.println("Account is out of credit");
		}
		else
		{
			setAcctBalance(balance);
			System.out.println("Account has credit");
		}
	}
	
	
	//getters and setters
	public String getAccountName()
	{
		return accountName;
	}
	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber()
	{
		Account.accountNumber += 1;
		
	}
	public int getSortCode()
	{
		return sortCode;
	}
	public void setSortCode(int sortCode) 
	{
		this.sortCode = sortCode;
	}
	public String getBranchName() 
	{
		return branchName;
	}
	public void setBranchName(String branchName) 
	{
		this.branchName = branchName;
	}
	public boolean isInCredit() 
	{
		return inCredit;
	}
	public void setInCredit(boolean inCredit) 
	{
		this.inCredit = inCredit;
	}
	public double getAcctBalance() 
	{
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance)
	{
		this.acctBalance = acctBalance;
	}
	
	public void getDetails()
	{
		System.out.println("This is an Account, the balance is " + getAcctBalance() + " and the account holder is " + getAccountName());
	}
	
	public void valuableAccount()
	{
		System.out.println("The account Balance is " + getAcctBalance());
	}
}
