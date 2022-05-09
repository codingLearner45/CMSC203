/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * Created subclass of beverage and contains additional instance variables for number of fruits. 
 * Extends Beverage.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Smoothie extends Beverage{
	private boolean addProtein;
	private int numFruits;
	private final double PROTEIN_PRICE = 1.50;
	private final double FRUIT_PRICE = 0.50;
	
	public Smoothie(String name, SIZE size, int numFruits, boolean addProtein)
	{
		super(name, TYPE.SMOOTHIE, size);
		this.addProtein = addProtein;
		this.numFruits = numFruits;
	}

	
	// String representation of a Smoothie drink including the name, size etc.
	@Override
	public String toString() {
		return "Smoothie [" +
				"name=" + super.getName() +
				", size=" + super.getSize() +
				", addProtein=" + addProtein +
				", numFruits=" + numFruits +
				", price=" + calcPrice() +
				"]";
	}


	// Computes the price of a smoothie based on size and protien addition and fruit addition.
	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		double price = 0;
		//double size = super.getSIZE_PRICE();
		if (super.getSize() == SIZE.MEDIUM)
		{
			 price +=  super.getBASE_PRICE()+ super.getSIZE_PRICE();
		}
		else if(super.getSize() == SIZE.LARGE)
		{
			price += super.getBASE_PRICE() + (2*super.getSIZE_PRICE());
		}
		else
		{
			price += super.getBASE_PRICE();
		}
		// find size price
		// add extra shot?
		// add extra syrup?
		if (addProtein)
		{
			price += PROTEIN_PRICE;
		}
		if (numFruits > 0)
		{
			price += numFruits * FRUIT_PRICE;
		}
		return price;
	}

	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result + (extraShot ? 1231 : 1237);
//		result = prime * result + (extraSyrup ? 1231 : 1237);
//		return result;
//	}

	// Checks equality based on the Beverage class equals method 
	// and additional instance variables for this class.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smoothie other = (Smoothie) obj;
		if (!(super.equals(obj) && addProtein == other.hasProtein() && numFruits == other.getNumFruits()))
			return false;
		return true;
	}

	public boolean hasProtein() {
		return addProtein;
	}

	public void setProtein(boolean addProtein) {
		this.addProtein = addProtein;
	}

	public int getNumFruits() {
		return numFruits;
	}

	public void setNumFruits(int numFruits) {
		this.numFruits = numFruits;
	}

	public double getPROTEIN_PRICE() {
		return PROTEIN_PRICE;
	}


	public double getFRUIT_PRICE() {
		return FRUIT_PRICE;
	}

	public double getBasePrice() {
		return super.getBASE_PRICE();
	}


	public String getBevName() {
		return super.getName();
	}


	public int getNumOfFruits() {
		return numFruits;
	}


	public boolean getAddProtien() {
		// TODO Auto-generated method stub
		return addProtein;
	}
}
