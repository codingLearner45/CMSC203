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
import static org.junit.Assert.assertEquals;


import org.junit.Test;



//sets up the initial conditions for testing
public class CashTest {
	RetailItem item = new RetailItem("chicken", 4, 2.75);
	CashRegister cash = new CashRegister(item, 5);
	
	//tests to make sure the getSubTotal method works properly
	@Test
	public void testSubTotal() {
		assertEquals(cash.getSubtotal(), 13.75, 0.005);
	}
	
	//tests to make sure the getTax method works properly
	@Test
	public void testTax() {
		assertEquals(cash.getTax(), 0.825, 0.005);
	}
	
	//tests to make sure the getTotal method works properly
	@Test
	public void testTotal() {
		assertEquals(cash.getTotal(), 14.58, 0.0055);
	}
}
