/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: (JUnit Lab 6.1).
 * Programming arrays and calculated mean from the data.
 * Due: 3/11/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

import java.util.Scanner;
public class Average {
	private int[] data = new int[5];
	private double mean;
	Scanner keyboard;
	//constructor to allocate memory for the array
	public Average()
	{
		keyboard = new Scanner(System.in);
		for(int i = 0; i <= data.length - 1; i++)
		{
			System.out.println("Enter score number " + (i + 1));
			data[i] = keyboard.nextInt();
		}
		selectionSort();
		calculateMean();
	}
	
	//uses a for loop the add to accumulator and divide by the total number of numbers used
	public void calculateMean()
	{
		double total = 0;
		for (int i = 0; i <= data.length - 1; i++)
		{
			total += data[i];
		}
		mean = total/data.length;
		System.out.print("Mean: " + mean);
			
	}
	
	//returns the numbers from highest to lowest as well as the mean
	public String toString()
	{
		String newString = "";
		for (int i = data.length - 1; i > 0; i--)
		{
			newString += i + " ";
		}
		newString += "/n";
		newString += mean;
		return newString;
		 
	}
	
	//helps sort the data set from highest to lowest
	public void selectionSort()
	{
		int index, smallestIndex, smallestValue;
		for (int i = 0; i <= data.length - 1; i++)
		{
			smallestIndex = i;
			smallestValue = data[i];
			for (index = i + 1; index < data.length; index++)
			{
				
				if (data[index] >= smallestValue)
				{
					smallestValue = data[index];
					smallestIndex = index;
				}
			}
			data[smallestIndex] = data[i];
			data[i] = smallestValue;
			System.out.println(data[i]);
		}
		
	}
	
	
}
