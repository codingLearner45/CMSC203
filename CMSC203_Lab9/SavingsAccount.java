/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 9B).
 * Subclass used to create a savings account and interest rate.
 * Due: 4/22/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class SavingsAccount extends BankAccount{
	private final double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	//creates constructor for savings account
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	//creates interest formula for monthly rate 
	public void postInterest()
	{
		double monthlyRate = rate/12;
		double interestValue = super.getBalance() * monthlyRate;
		super.deposit(interestValue);
	}
	
	//returns the account number
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//creates constructor to change account number
	public SavingsAccount(SavingsAccount save, double amount)
	{
		super(save, amount);
		int x = save.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + x;
	}
}
