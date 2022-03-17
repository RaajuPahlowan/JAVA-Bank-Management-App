package classes;

import java.lang.*;
import interfaces.*;

public class Bank implements AccountOperations, EmployeeOperations, CustomerOperations
{
	private String name;
	private String branchName;
	private Account accounts[] = new Account [1000];
	private Customer customers[] = new Customer [500];
	private Employee employees[] = new Employee [100];
	
	public Bank(){}
	public Bank(String name, String branchName)
	{
		this.name = name;
		this.branchName = branchName;
	}
	
	public void setName(String name){this.name = name;}
	public void setBranchName(String branchName){this.branchName = branchName;}
	
	public String getName(){return name;}
	public String getBranchName(){return branchName;}

	public boolean insertAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Account searchAccount(String accountNumber)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber().equals(accountNumber))
				{
					return accounts[i];
				}
			}
		}
		return null;
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
			}
		}
	}
	
	
	public boolean insertCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Customer searchCustomer(int nid)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid)
				{
					return customers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCustomers()
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				customers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Bank Name: " + name);
		System.out.println("Bank Branch: " + branchName);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Accounts ###");
		this.showAllAccounts();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Employees ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}