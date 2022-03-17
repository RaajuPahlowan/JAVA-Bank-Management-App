import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		Bank bank = new Bank("DBBL", "Banani");
		
		System.out.println("------------------------------------");
		System.out.println("Welcome to DBBL Bank");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
		
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Show Bank Information");
			System.out.println("\t6. Exit");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You have selected Employee Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Insert Employee");
							System.out.println("#################################");
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Employee");
							System.out.println("#################################");
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Employee");
							System.out.println("#################################");
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Employees");
							System.out.println("#################################");
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You have selected Customer Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Customer");
					System.out.println("\t3. Search Customer");
					System.out.println("\t4. Show All Customer");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Insert Customer");
							System.out.println("#################################");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							System.out.print("Enter Customer Phone Number: ");
							String phnNumber1 = sc.next();
								
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
							c1.setPhnNumber(phnNumber1);
								
							if(bank.insertCustomer(c1))
							{
								System.out.println("*** Customer Inserted, NID: " + c1.getNid() + "  ***");
							}
							else
							{
								System.out.println("*** Customer NOT Inserted, NID: " + c1.getNid() + "  ***");
							}								
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Customer");
							System.out.println("#################################");
							
							System.out.print("Enter the NID to remove a customer: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = bank.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.println("*** Customer Found  ****");
								
								if(bank.removeCustomer(c2))
								{
									System.out.println("*** Customer Removed, NID: " + c2.getNid() + " ***");
								}
							}
							else
							{
								System.out.println("*** Customer NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Customer");
							System.out.println("#################################");
							
							System.out.print("Enter the NID to search a customer: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = bank.searchCustomer(nid3);
							
							if(c3 != null)
							{
								System.out.println("*** Customer Found  ****");
								c3.showDetails();
							}
							else
							{
								System.out.println("*** Customer NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Customers");
							System.out.println("#################################");
							
							bank.showAllCustomers();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("#####################################");
					System.out.println("You have selected Account Management");
					System.out.println("#####################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Account");
					System.out.println("\t2. Remove Account");
					System.out.println("\t3. Search Account");
					System.out.println("\t4. Show All Account");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Insert Account");
							System.out.println("#################################");
							
							System.out.print("Enter NID to verify the customer: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = bank.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.println("*** Customer Verified  ***");
								
								Account a = null;
								
								System.out.println("There are two Types of Accounts...");
								System.out.println("Which one do you want?");
								System.out.println("\t1. Savings Account");
								System.out.println("\t2. Fixed Account");
								System.out.println("\t3. Go back");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter your type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								
								if(type == 1)
								{
									System.out.print("Enter Account Number: ");
									String an = sc.next();
									System.out.print("Enter Balance: ");
									double b = sc.nextDouble();
									System.out.print("Interest Rate: ");
									double ir = sc.nextDouble();

									SavingsAccount sa = new SavingsAccount(an, c1, b, ir);
									a = sa;
								}
								else if(type == 2)
								{
									System.out.print("Enter Account Number: ");
									String an = sc.next();
									System.out.print("Enter Balance: ");
									double b = sc.nextDouble();
									System.out.print("Tenure Year: ");
									int ty = sc.nextInt();

									FixedAccount fa = new FixedAccount(an, c1, b, ty);
									a = fa;
								}
								else if(type == 3)
								{
									System.out.println("#####################################");
									System.out.println("Going Back....");
									System.out.println("#####################################");
								}
								else
								{
									System.out.println("#####################################");
									System.out.println("Invalid Type... Going Back....");
									System.out.println("#####################################");
								}
								
								if(a != null)
								{
									if(bank.insertAccount(a))
									{
										System.out.println("***  Account Inserted, Account Number: " + a.getAccountNumber());
									}
									else
									{
										System.out.println("***  Account NOT Inserted, Account Number: " + a.getAccountNumber());
									}
								}
							}
							else
							{
								System.out.println("*** Invalid Customer, Can NOT Create Account  ****");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Remove Account");
							System.out.println("#################################");
							
							break;
							
						case 3:
							
							System.out.println("#################################");
							System.out.println("You have selected Search Account");
							System.out.println("#################################");
							
							break;
							
						case 4:
							
							System.out.println("#################################");
							System.out.println("You have selected Show All Accounts");
							System.out.println("#################################");
							
							bank.showAllAccounts();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
					
					break;
					
				case 4:
				
					System.out.println("######################################");
					System.out.println("You have selected Account Transactions");
					System.out.println("######################################");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Deposit Money");
					System.out.println("\t2. Withdraw Money");
					System.out.println("\t3. Show Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("#################################");
							System.out.println("You have selected Deposit Money");
							System.out.println("#################################");
							
							System.out.print("Enter Account Number for verification: ");
							String an1 = sc.next();
							
							Account a1 = bank.searchAccount(an1);
							
							if(a1 != null)
							{
								System.out.println("*** Account Verified  ***");
								System.out.println("Account Holder Name: " + a1.getCustomer().getName());
								
								System.out.println("Current Balance: " + a1.getBalance());
								
								System.out.print("Deposit Amount : ");
								double am = sc.nextDouble();
								
								if(a1.depositMoney(am))
								{
									System.out.println("----  Deposit Sucessfull  ----");
									System.out.println("New Balance: " + a1.getBalance());
									frwd.writeInFile(am + " Deposited in " + a1.getAccountNumber());
								}
								else
								{
									System.out.println("---  Deposit Failed  ---");
								}								
							}
							else
							{
								System.out.println("***  Invalid Account, Can NOT Deposit  ***");
							}
							
							break;
							
						case 2:
							
							System.out.println("#################################");
							System.out.println("You have selected Withdraw Money");
							System.out.println("#################################");
							
							System.out.print("Enter Account Number for verification: ");
							String an2 = sc.next();
							
							Account a2 = bank.searchAccount(an2);
							
							if(a2 != null)
							{
								System.out.println("*** Account Verified  ***");
								System.out.println("Account Holder Name: " + a2.getCustomer().getName());
								
								System.out.println("Current Balance: " + a2.getBalance());
								
								System.out.print("Withdraw Amount : ");
								double am = sc.nextDouble();
								
								if(a2.withdrawMoney(am))
								{
									System.out.println("----  Withdraw Sucessfull  ----");
									System.out.println("New Balance: " + a2.getBalance());
									frwd.writeInFile(am + " Withdrawn from " + a2.getAccountNumber());
								}
								else
								{
									System.out.println("---  Withdraw Failed  ---");
								}								
							}
							else
							{
								System.out.println("***  Invalid Account, Can NOT Withdraw  ***");
							}
							
							
							break;
							
						case 3:
							
							System.out.println("#####################################");
							System.out.println("You have selected Transaction History");
							System.out.println("#####################################");
							
							frwd.readFromFile();
							
							break;
				
							
						case 4:
							
							System.out.println("#####################################");
							System.out.println("Going Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("#####################################");
							
							break;
					}
						
					break;
					
				case 5:
					
					System.out.println("##################################");
					System.out.println("You have selected Bank Information");
					System.out.println("##################################");
					
					bank.showDetails();
					
					break;
					
				case 6:
					
					System.out.println("#####################################");
					System.out.println("Thank You For Using Our System");
					System.out.println("#####################################");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("#####################################");
					System.out.println("Invalid Choice... Try Again....");
					System.out.println("#####################################");
					
					break;
			}
		}
	}
}