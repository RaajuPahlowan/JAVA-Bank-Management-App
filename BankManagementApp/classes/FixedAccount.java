package classes;

import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount(){}
	public FixedAccount(String accountNumber, Customer customer, double balance, int tenureYear)
	{
		super(accountNumber, customer, balance);
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(int tenureYear){this.tenureYear = tenureYear;}
	public int getTenureYear(){return tenureYear;}
	
	public void showDetails()
	{
		System.out.println("**** Account Information ****");
		this.getCustomer().showDetails();
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account Balance: " + this.getBalance());
		System.out.println("Tenure Year: " + tenureYear);
		System.out.println();
	}
}