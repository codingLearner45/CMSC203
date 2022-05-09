/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * Abstract class that creates different beverage names, types, size.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public abstract class Beverage {
	private String name;
	private TYPE type;
	private SIZE size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	
	public Beverage(String name, TYPE type, SIZE size)
	{
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	// Calculates the price based on size.
	public abstract double calcPrice();

	// String representation  of a Beverage.
	@Override
	public String toString() {
		return "Beverage [name=" + name + ", type=" + type + ", size=" + size + "]";
	}

	// Overrides the hash code function to return a 0 or a hash code equivalent.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	// Checks equality based on name, type, size of the beverage. Returns a True or a False.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beverage other = (Beverage) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getBevName() {
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setBevName(String name) {
		this.name = name;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public SIZE getSize() {
		return size;
	}

	public void setSize(SIZE size) {
		this.size = size;
	}

	public double getBASE_PRICE() {
		return BASE_PRICE;
	}

	public double getSIZE_PRICE() {
		return SIZE_PRICE;
	}

	
	
	
	 
	
}
