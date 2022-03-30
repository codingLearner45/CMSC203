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
/**
 This class represents nonnegative amounts of money. 
*/
public class Money 
{
	 // The number of dollars 
	 private long dollars; 
	 // The number of cents 
	 private long cents; 
	 /** 
	Constructor
	@param amount The amount in decimal format. 
	 */ 
	 public Money(double amount) 
	 { 
		if (amount < 0) 
		{
		System.out.println("Error: Negative amounts " + 
		"of money are not allowed."); 
		System.exit(0); 
		}
		else
		{
		long allCents = Math.round(amount * 100); 
		dollars = allCents / 100; 
		cents = allCents % 100; 
		}
	} 
	 
	//Copy constructor
	public Money(Money m) {
		//Copy parameter object variable to instance variable
		this.dollars = m.dollars;
		//Copy parameter object variable to instance variable
		this.cents = m.cents;
	}
 
 // ADD LINES FOR TASK #1 HERE
 // Document and write a copy constructor 
 /**
The add method 
@param otherAmount The amount of money to add. 
@return The sum of the calling Money object 
and the parameter Money object. 
 */
 public Money add(Money otherAmount) 
 {
	Money sum = new Money(0); 
	sum.cents = this.cents + otherAmount.cents; 
	long carryDollars = sum.cents / 100; 
	sum.cents = sum.cents % 100; 
	sum.dollars = this.dollars + 
	otherAmount.dollars + 
	carryDollars; 
	return sum; 
 }
 /**
The subtract method 
@param amount The amount of money to subtract. 
@return The difference between the calling Money 
object and the parameter Money object.
 */
 public Money subtract (Money amount) 
 {
Money difference = new Money(0); 
if (this.cents < amount.cents) 
{
this.dollars = this.dollars - 1;
this.cents = this.cents + 100; 
}
 
difference.dollars = this.dollars - amount.dollars;
difference.cents = this.cents - amount.cents;
return difference; 
 } 
 /** 
The compareTo method 
@param amount The amount of money to compare against. 
@return -1 if the dollars and the cents of the 
calling object are less than the dollars and 
the cents of the parameter object. 
0 if the dollars and the cents of the calling 
object are equal to the dollars and cents of 
the parameter object. 
1 if the dollars and the cents of the calling 
object are more than the dollars and the 
cents of the parameter object. 
 */ 
 public int compareTo(Money amount) 
 { 
int value;
if(this.dollars < amount.dollars) 
value = -1; 
else if (this.dollars > amount.dollars) 
value = 1; 
else if (this.cents < amount.cents) 
value = -1; 
else if (this.cents > amount.cents) 
value = 1; 
else
value = 0; 
return value; 
 } 
 // ADD LINES FOR TASK #2 HERE 
 // Document and write an equals method 
 // Document and write a toString method 
 public boolean equals(Money money)
 {
	 return (money.dollars == this.dollars && money.cents == this.cents);
 }
 
 @Override
 public String toString()
 {
	 String str = "";
	 str = "$" + this.dollars + ".";
	 if(cents < 10)
		str += "0" + cents;
	 
	 return str;
 }
} 
 