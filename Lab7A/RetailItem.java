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

public class RetailItem {
	private int starting_units;   // Starting number of items
    private double item_price;  // The price of the item
    private String product;    // The item being purchased
    //private int units;
	
    public RetailItem(String products, int count, double price)
	  {
		  this.product = products;
		  this.starting_units = count;
		  this.item_price = price;
		  
	  }

    //represents the name of the product being bought
	public String getDescription() {
		return product;
	}

	//represents the number of units available
	public int getUnitsOnHand() {
		return starting_units;
	}

	//represents the price of the product being bought
	public double getPrice() {
		return item_price;
	}
	
	//number of units after purchasing the quantity of items
	public void setUnitsOnHand(int num) {
		this.starting_units = num;
	}
    
}
