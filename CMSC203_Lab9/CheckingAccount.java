/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 9B).
 * Subclass used to create method to withdraw from an account.
 * Due: 4/22/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class CheckingAccount extends BankAccount{
	private final static double FEE = 0.15;
	
	//creates the constructor for the checking account
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	//creates withdraw method to withdraw money from an account
	@Override
	public boolean withdraw(double amount)
	{

		amount += FEE;
		
		return super.withdraw(amount);

	}
	
}
