import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Class: CMSC203 


 * Instructor: Gary Thai
 * Description: Project 5.
 * Creates methods to determine the lowest and highest data points within the array
 * Due: 4/22/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the project assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class TwoDimRaggedArrayUtility {
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	// Takes in a passed in two-dimensional ragged array and returns the total of the elements in the array.
	public static double getTotal(double[][] data)
	{
		double total = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				total += data[i][j];
			}
		}
		return total;
	}
	
	// Takes in a passed in two-dimensional ragged array and returns the average of the elements in the array.

	public static double getAverage(double[][] data)
	{
		double total = 0.0;
		int number = 0;
		double average = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				total += data[i][j];
				number++;
			}
		}
		average = total/number;
		return average;
	}
	
	// Takes in a passed in two-dimensional ragged array and a row index and returns the total of that row.
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0.0;
		for (int i = 0; i < data[row].length; i++)
		{
			
			total += data[row][i];
			
		}
		return total;
	}
	// Takes in a passed in two-dimensional ragged array along with a column index and returns the total of that column.
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			
			if (col < data[i].length)
			{
				total += data[i][col];
			}	
			
		}
		return total;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a row index and returns the largest element in that row.
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = 0.0;
		for (int i = 0; i < data[row].length; i++)
		{
			
			if (i == 0)
			{
				highest = data[row][i];
			}
			else if (data[row][i] > highest)
			{
				highest = data[row][i];
			}
			
		}
		return highest;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a row index and returns the index of the largest element in that row.
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		double highest = 0.0;
		int index = -1;
		for (int i = 0; i < data[row].length; i++)
		{
			
			if (i == 0)
			{
				highest = data[row][i];
				index = i;
			}
			else if (data[row][i] > highest)
			{
				highest = data[row][i];
				index = i;
			}
			
		}
		return index;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a row index and returns the smallest element in that row.
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = 0.0;
		for (int i = 0; i < data[row].length; i++)
		{
			
			if (i == 0)
			{
				lowest = data[row][i];
			}
			else if (data[row][i] < lowest)
			{
				lowest = data[row][i];
			}
			
		}
		return lowest;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a row index and returns the index of the smallest element in that row.
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double lowest = 0.0;
		int index = -1;
		for (int i = 0; i < data[row].length; i++)
		{
			
			if (i == 0)
			{
				lowest = data[row][i];
				index = i;
			}
			else if (data[row][i] < lowest)
			{
				lowest = data[row][i];
				index = i;
			}
			
		}
		return index;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a column index and returns the largest element in that column.
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			
			if (col < data[i].length && data[i][col] > highest)
			{
				highest = data[i][col];
			}
			
		}
		return highest;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a column index and returns the index of the largest element in that column.
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double highest = 0.0;
		int index = -1;
		for (int i = 0; i < data.length; i++)
		{
			
			if (col < data[i].length && data[i][col] > highest)
			{
				highest = data[i][col];
				index = i;
			}
			
		}
		return index;
	}
	
	// Takes in a passed in two-dimensional ragged array along with a column index and returns the smallest element in that column.
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = Double.MAX_VALUE;
		for (int i = 0; i < data.length; i++)
		{
			
			if (col < data[i].length && data[i][col] < lowest)
			{
				lowest = data[i][col];
			}
			
		}
		return lowest;
	}
	
	// Takes in a passed in a two-dimensional ragged array along with a column index and returns the index of the smallest element in that column.
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double lowest = Double.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < data.length; i++)
		{
			
			if (col < data[i].length && data[i][col] < lowest)
			{
				lowest = data[i][col];
				index = i;
			}
			
		}
		return index;
	}
	
	// Takes in a passed in a two-dimensional ragged array and returns the largest element in the array.
	public static double getHighestInArray (double[][] data)
	{
		double largest = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if(i == 0 && j == 0)
				{
					largest = data[i][j];
				}
				else if(data[i][j] > largest)
				{
					largest = data[i][j];
				}
			}
		}
		return largest;
	}
	
	// Takes in a passed in two-dimensional ragged array and returns the smallest element in the array.
	public static double getLowestInArray (double[][] data)
	{
		double smallest = 0.0;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if(i == 0 && j == 0)
				{
					smallest = data[i][j];
				}
				else if(data[i][j] < smallest)
				{
					smallest = data[i][j];
				}
			}
		}
		return smallest;
	}
	
	// Reads in content of a passed in file, line by line, and returns a two-dimensional ragged array of doubles.
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		double[][] text;
		Scanner scan = new Scanner(file);
		int rowCount = 0;
		while (scan.hasNextLine())
		{
			rowCount++;
			scan.nextLine();
		}
		scan.close();
		scan = new Scanner(file);
		String temp = "";
		text = new double[rowCount][];
		for(int i = 0; i < text.length; i++)
		{
			temp = scan.nextLine();
			String[] str = temp.split(" ");
			text[i] = new double[str.length];
			for(int j = 0; j < text[i].length; j++)
			{
				text[i][j] = Double.valueOf(str[j]);
			}
		}
		scan.close();
		return text;
	}
	
	// Takes in a passed in two-dimensional ragged array and a file. After that, takes the content of the array and writes it into the passed in file.
	public static void writeToFile(double[][] data,java.io.File outputFile) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(outputFile);
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				writer.print(data[i][j] + " ");
				
			}
			writer.println();
		}
		writer.close();
	}
}
