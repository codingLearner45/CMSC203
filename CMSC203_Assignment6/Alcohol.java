/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * Created subclass of beverage and contains additional instance variable 
 * for whether or not it is offered in the weekend. Extends Beverage.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Alcohol extends Beverage{
	private boolean isWeekend;
	private final double WEEKEND_PRICE = 0.60;
	
	
	public Alcohol(String name, SIZE size, boolean isWeekend)
	{
		super(name, TYPE.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}

	// String representation of an alcohol drink.
	@Override
	public String toString() {
		return "Alcohol [" +
				"name=" + super.getName() +
				", size=" + super.getSize() +
				", isWeekend=" + isWeekend +
				", price=" + calcPrice() +
				"]";
	}

	// Calculates the price based on size.
	@Override
	public double calcPrice() {
		double price = 0;
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
		if (isWeekend)
		{
			price += WEEKEND_PRICE;
		}
		return price;
	}

	// Checks equality based on the Beverage class. 
	// Returns a True or a False based on whether the object is equal to the passed in object.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alcohol other = (Alcohol) obj;
		if (!(super.equals(obj) && isWeekend == other.getWeekend()))
			return false;
		return true;
	}

	public boolean getWeekend() {
		return isWeekend;
	}
	
	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public double getWEEKEND_PRICE() {
		return WEEKEND_PRICE;
	}

	public double setWEEKEND_PRICE() {
		return WEEKEND_PRICE;
	}


	public double getBasePrice() {
		return super.getBASE_PRICE();
	}
}
