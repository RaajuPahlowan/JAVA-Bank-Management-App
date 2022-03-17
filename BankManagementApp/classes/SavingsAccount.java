package classes;

import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount(){}
	public SavingsAccount(String accountNumber, Customer customer, double balance, double interestRate)
	{
		super(accountNumber, customer, balance);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	public double getInterestRate(){return interestRate;}
	
	public void showDetails()
	{
		System.out.println("**** Account Information ****");
		this.getCustomer().showDetails();
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account Balance: " + this.getBalance());
		System.out.println("Interest Rate: " + interestRate);
		System.out.println();
	}
}