/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Classes Lab 7B).
 * Makes use of aggregation by implementing different classes.
 * Due: 4/1/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class CreditCard {
	private Money balance;
	private Money creditLimit;
	private Person owner;
	
	//constructor to set up various variables
	public CreditCard(Person newCardHolder, Money limit)
	{
		owner = newCardHolder;
		creditLimit = limit;
		balance = new Money(0);
	}
	
	//obtains a person's balance
	public String getBalance()
	{
		return balance.toString();
	}
	
	//Displays the credit limit of a person
	public String getCreditLimit()
	{
		return creditLimit.toString();
	}
	
	//gets the credentials of a person
	public String getPersonals()
	{
		return owner.toString();
	}
	
	//adds money to a user's account as long as it doesn't exceed the limit
	public void charge(Money mon)
	{
		Money m = new Money(balance.add(mon));
		if (m.compareTo(creditLimit) > 0)
		{
			System.out.println("Exceeds credit limit");
		}
		else
		{
			balance = m;
			System.out.println("Charge: " + mon);
		}
		
		
	}
	
	//subtracts money from a user's account
	public void payment(Money mon)
	{
		Money m = new Money(balance.subtract(mon));
		balance = m;
		System.out.println("Payment: " + mon);
	}
}
