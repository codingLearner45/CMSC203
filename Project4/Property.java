/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: Project 4.
 * Instance variables for property name, city, rental amount, owner, and plot..
 * Due: 4/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the project assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	//constructor create empty strings and initialize rent amount to 0
	public Property()
	{
		this.plot = new Plot();
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0;
	}
	
	//copy constructor that initializes attributes
	public Property(Property p)
	{
		this.plot = p.plot;
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
	}
	
	//parameterized constructor that initializes the parameters 
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	//parameterized constructor that initializes the parameters along with the plot attributes
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	//returns the name of city
	public String getCity() {
		return city;
	}

	//changes the name of city
	public void setCity(String city) {
		this.city = city;
	}
	
	//returns the name of the owner
	public String getOwner() {
		return owner;
	}

	//changes the name of the owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//returns the name of the property
	public String getPropertyName() {
		return propertyName;
	}

	//changes the name of the property
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	//returns the amount of rent
	public double getRentAmount() {
		return rentAmount;
	}

	//changes the amount of the rent
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	//returns the plot
	public Plot getPlot() {
		return plot;
	}

	//changes the attributes of plot
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	//displays the information
	@Override
	public String toString()
	{
		return "Property Name: " + propertyName + "\n" + 
				"Located in " + city + "\n" +
				"Belonging to: " + owner + "\n" +
				"Rent Amount: " + rentAmount;
		
	}
	
}
