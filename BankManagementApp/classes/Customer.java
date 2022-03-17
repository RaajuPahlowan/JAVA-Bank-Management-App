package classes;
import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private String phnNumber;
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	
	public void showDetails()
	{
		System.out.println("Account Holder NID: " + nid);
		System.out.println("Account Holder Name: " + name);
		System.out.println("Account Holder Phone Number: " + phnNumber);
		System.out.println();
	}
}