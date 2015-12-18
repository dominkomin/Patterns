package Facade;

public class Account
{

	private double cashInAccount = 1000.00;

	public double getCashInAccount()
	{
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn)
	{
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposited)
	{
		cashInAccount += cashDeposited;
	}

	public boolean isMoreThanBalance(double cashToWithdrawal)
	{
		return cashToWithdrawal > getCashInAccount() ? false : true;
	}

}
