/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Classes Lab 7A).
 * Implementing a class, creating a constructor and calculating values with methods.
 * Due: 3/25/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class CashRegister {
	private final double TAX_RATE = 0.06;
	private double retail;
	private int quantity;
	
	//creates a constructor to initialize the retail and quantity
	public CashRegister(RetailItem item, int q)
	{
		retail = item.getPrice();
		quantity = q;
	}
	
	//calculates the subtotal based on the quantity the user wanted
	public double getSubtotal() {
		return (retail * quantity);
	}
	
	//calculates the tax based on the calculated subtotal
	public double getTax() {
		
		return (TAX_RATE * (getSubtotal()));
	}
	
	//calculates the total by adding the subtotal and the tax
	public double getTotal() {
		return getSubtotal() + getTax();
	}
}
