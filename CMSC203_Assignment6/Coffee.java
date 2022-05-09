/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * Created subclass of beverage and contains additional instance variables 
 * of type boolean to indicate if it contains extra shot of coffee. Extends Beverage.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Coffee extends Beverage{
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_PRICE = 0.50;
	private final double SYRUP_PRICE = 0.50;
	
	public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup)
	{
		super(name, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	// String representation of the coffee beverage including its name and other details like extra syrup etc.
	@Override
	public String toString() {
		return "Coffee [" +
				"name=" + super.getName() +
				", size=" + super.getSize() +
				", extraShot=" + extraShot +
				", extraSyrup=" + extraSyrup +
				", price=" + calcPrice() +
				"]";
	}

	// Computes price based on size of the beverage.
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
		if (extraShot)
		{
			price += SHOT_PRICE;
		}
		if (extraSyrup)
		{
			price += SYRUP_PRICE;
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

	// Checks equality based on name, checks equality based on the Beverage class equals method 
	// and other variables like Extra Shot and Extra Syrup.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (!(super.equals(obj) && extraShot == other.isExtraShot() && extraSyrup == other.isExtraSyrup()))
			return false;
		return true;
	}
	
	

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}


	public boolean isExtraSyrup() {
		return extraSyrup;
	}


	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}


	public double getSHOT_PRICE() {
		return SHOT_PRICE;
	}


	public double getSYRUP_PRICE() {
		return SYRUP_PRICE;
	}


	public double getBasePrice() {
		return super.getBASE_PRICE();
	}


	public String getBevName() {
		return super.getName();
	}


	public boolean getExtraShot() {
		return extraShot;
	}


	public boolean getExtraSyrup() {
		return extraSyrup;
	}	
}
