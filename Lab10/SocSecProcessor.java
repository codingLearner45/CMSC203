/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 10).
 * Methods that catches exceptions regarding ssn.
 * Due: 4/29/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import java.util.Scanner;
public class SocSecProcessor {
	//asks the user to type a name and ssn number
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		String response;
		do
		{
			System.out.println("Name? ");
			String name = keyboard.nextLine();
			System.out.println("SSN? ");
			String ssn = keyboard.nextLine();
			try
			{
				if(isValid(ssn))
				{
					System.out.println(name + ' ' + ssn + " is valid");
				}
			}
			catch(Exception e)
			{
				System.out.println(name + ' ' + ssn);
				e.printStackTrace();
			}
			System.out.println("Continue (y or n)? ");
			response = keyboard.nextLine();
			
		}while(response.equals("y"));
		
	}
	//catches exceptions and returns reasons for error
	public static boolean isValid(String ssn) throws SocSecException
	{
		if(ssn.length() != 11)
		{
			
			throw new SocSecException("Invalid length");
		}
		if(ssn.charAt(3) != '-' || ssn.charAt(6) != '-')
		{
			throw new SocSecException("Dashes at wrong positions");
		}
		for (int i = 0; i < ssn.length(); i++)
		{
			if (i == 3 || i == 6)
			{
				continue;
			}
			if((!Character.isDigit(ssn.charAt(i))))
			{
				throw new SocSecException("contains a character that is not a digit");
			}
		}
		return true;
	}
}
