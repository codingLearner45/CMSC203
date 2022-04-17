/*
 * Class: CMSC203 


 * Instructor: Gary Thai
 * Description: Project 5.
 * Calculates the total holiday bonuses and the amount of bonuses each retail store gets 
 * Due: 4/22/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the project assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class HolidayBonus {
	public HolidayBonus()
	{
		
	}
		
	// Takes in a passed in two-dimensional ragged array of doubles along with the  bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and bonus amount for all other stores. After doing the necessary computations it will return an array containing the holiday bonuses for each of the stores in the district.
	// Uses methods in the TwoDimRaggedArrayUtility class. 
	public static double[] calculateHolidayBonus(double[][] data,double high,double low,double other)
	{
		double[] bonus = new double[data.length];
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, j);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, j);
				if (data[i][j] > 0)
				{
					if (data[i][j] == highest)
					{
						bonus[i] = bonus[i] + high;
					}
					else if (data[i][j] == lowest)
					{
						bonus[i] = bonus[i] + low;
					}
					else
					{
						bonus[i] = bonus[i] + other;
					}
				}
				
			}
		}
		return bonus;
	}
	
	// Takes in a passed in two-dimensional ragged array of doubles along with the bonus amount for the store with the highest sales in a category and the bonus amount for the store with the lowest sales in a category and bonus amount for all other stores. After doing the necessary computations it will return double which is the total of all Holiday Bonuses for the District.
	// Uses methods in the TwoDimRaggedArrayUtility class.
	public static double calculateTotalHolidayBonus(double[][] data,double high,double low,double other)
	{
		double[] holidayBonus = calculateHolidayBonus(data, high, low, other);
		double total = 0.0;
		for (int i = 0; i < holidayBonus.length; i++)
		{
			total += holidayBonus[i];
		}
		return total;
	}
}
