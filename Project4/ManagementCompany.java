/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: Project 4.
 * It will contain instance variables of name, tax Id, management fee,
 * MAX_PROPERTY (a constant set to 5) and an array named properties of Property objects of size MAX_PROPERTY, 
 * Not complete yet
 * Due: 4/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the project assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class ManagementCompany {
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	//no-arg constructor creating a management company object
	public ManagementCompany()
	{
		name = "";
		taxID = "";
		this.plot = new Plot(0, 0, 10, 10);
		this.properties = new Property[MAX_PROPERTY];
		this.mgmFeePer = 0;
	}
	
	//constructor creating a management company object with the passed in information
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.plot = new Plot(0, 0, 10, 10);
		this.properties = new Property[MAX_PROPERTY];
		this.mgmFeePer = mgmFee;
	}
	
	//constructor creating a management company object with the passed in information
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
		this.mgmFeePer = mgmFee;
	}
	
	//constructor creating a management company object from another management company
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
		this.mgmFeePer = otherCompany.mgmFeePer;
	}
	
	//creates property object from another property object 
	public int addProperty (Property property)
	{
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] == null)
			{
				properties[i] = property;
				return i;
			}
			
			if (properties[properties.length - 1] != null)
			{
				return -1;
			}
			if (property == null)
			{
				return -2;
			}
			if (!this.plot.encompasses(property.getPlot()))
			{
				return -3;
			}
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}	
		}
		return MAX_PROPERTY + 1;
		
	}
	
	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//creates property object using a default plot
	public int addProperty (String name, String city, double rent, String owner)
	{
		Property property = new Property(name, city, rent, owner);
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] == null)
			{
				properties[i] = property;
				return i;
			}
			
			if (properties[properties.length - 1] != null)
			{
				return -1;
			}
			if (property == null)
			{
				return -2;
			}
			if (!this.plot.encompasses(property.getPlot()))
			{
				return -3;
			}
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}	
		}
		return MAX_PROPERTY + 1;
		
	}
	
	//creates property object and adds it to properties array 
	public int addProperty (String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] == null)
			{
				properties[i] = property;
				return i;
			}
			
			if (properties[properties.length - 1] != null)
			{
				return -1;
			}
			if (property == null)
			{
				return -2;
			}
			if (!this.plot.encompasses(property.getPlot()))
			{
				return -3;
			}
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}	
		}
		return MAX_PROPERTY + 1;
		
	}
	
	//displays the information at a given index
	public String displayPropertyAtIndex(int i)
	{
		return properties[i].toString();
	}
	
	//returns the MAX_PROPERTY constant
	public int getMAX_PROPERTY() 
	{
		return MAX_PROPERTY;
	}
	
	//determines which property has the maximum rent
	public double maxRentProp()
	{
		int index = 0;
		double max = 0.0;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[index].getRentAmount() < properties[i].getRentAmount())
				{
					index = i;
				}
			}
			
		}
		max = properties[index].getRentAmount();
		return max;
	}
	
	//determines which property has the maximum rent and returns its index
	public int maxRentPropertyIndex()
	{
		double max = 0;
		int index = 0;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[i].getRentAmount() > max)
				{
					index = i;
				}
			}	
		}
		return index;
	}
	
	
	//finds the sum of all the rent within the properties
	public double totalRent()
	{
		double total = 0.0;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				total += properties[i].getRentAmount();
			}
		}
		return total;
	}
	
	@Override
	public String toString()
	{
		String title = "";
		title += "List of the properties for " + name + " , taxID: " + taxID + "\n";
		title += "___________________________________________________" + "\n";
		
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				title +=
						"Property name: " + properties[i].getPropertyName() + "\n" +
						"Located in " +  properties[i].getCity() + "\n" + 
						"Belonging to: " + properties[i].getOwner() + "\n" +
						"Rent Amount: " + properties[i].getRentAmount() + "\n";
			}
		}
		title += "___________________________________________________" + "\n";
		title += "Total Management Fee: " + (totalRent() * (mgmFeePer/100));
		return title;
	}
	
}
