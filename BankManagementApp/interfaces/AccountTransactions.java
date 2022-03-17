package interfaces;

import java.lang.*;

public interface AccountTransactions
{
	boolean depositMoney(double amount);
	boolean withdrawMoney(double amount);
}