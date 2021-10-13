package bankAccount;

public class bankAccountClass {

	
private String name;
private double balance;
private int acct;
private static int accountNumber = 0;
private boolean overdrawn;



public bankAccountClass(String name, int number, double balance, boolean overdrawn)
	{
	this.balance = balance;
	this.accountNumber = number;
	this.name = name;
	this.overdrawn = overdrawn;
	}


	public void accountName(String name)
	{
	this.name = name;
	}
	
	public void accountNumber(int number)
	{
	number = number;
	}
	
	public void BankAccount() 
	{
		balance=0;
	}
	
	public void bankAccount(int initialBalance) 
	{
		balance=initialBalance;
	}
	
	public void deposit (double amount) 
	{
		balance=balance+amount;
	}
	
	public void withdraw (double amount) 
	{
		balance=balance-amount;
	}
	
	private void setOverdrawn(boolean status, double amount) 
	{
		  if (amount>balance) 
			{
				throw new IllegalArgumentException("WD amount "+amount+" exceeds balance of "+balance);
			}
			balance = balance - amount;
	  }

	public void transfer(double amount, bankAccountClass harryChecking) 
	{
		withdraw(amount);
		harryChecking.deposit(amount);
	}
	public void interest() 
	{
		balance = balance + (balance * .035);
	}
	
	public int getAccountNumber(int number)
	{
		return number;
	}
			

	public String getAccountName()
	{
		return name;
	}
	

	public boolean overdawn()
	{
		return overdrawn;
	}
		
	public double getBalance() 
	{
		return balance;
	}
	
	public void string() 
	{
		System.out.println("account number: "+ accountNumber + " owned by "+ name+ " has balance of " +balance);
	if (balance >= 0) {
		System.out.println("account not overdrawn");
	}
	else {
		System.out.println("account overdrawn by " + overdrawn);
	}
	}
}

