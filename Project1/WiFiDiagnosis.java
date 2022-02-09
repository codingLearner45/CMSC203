/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Runs a flow chart about fixing the computer)
 * Due: 2/11/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak
*/

import java.util.Scanner;


public class WiFiDiagnosis {
	public static void main(String [] args) {
		String firstResponse, secondResponse, thirdResponse, fourthResponse;
		Scanner result = new Scanner (System.in);
		//Checking if rebooting computer fixes the problem.
		System.out.println("First Step: Reboot the computer and try to connect");
		System.out.println("Did that fix the problem? (yes or no)");
		do {
			firstResponse = result.nextLine();
			while(!firstResponse.equals("yes") && !firstResponse.equals("no"))
			{
				System.out.println("Invalid Response. Try again.");
				break;
			}
		} while (!firstResponse.equals("yes") && !firstResponse.equals("no"));
		
		
		if (firstResponse.equals("no"))
		{
			//Checking if rebooting router fixes the problem.
			System.out.println("Second Step: Reboot the router and try to connect");
			System.out.println("Did that fix the problem? (yes or no)");
			do {
				secondResponse = result.nextLine();
				while(!secondResponse.equals("yes") && !secondResponse.equals("no"))
				{
					System.out.println("Invalid Response. Try again.");
					break;
				}
			} while (!secondResponse.equals("yes") && !secondResponse.equals("no"));
			if (secondResponse.equals("no"))
			{
				//Checking to make sure connecting the cables fixes the problem.
				System.out.println("Third Step: Make sure the cables connecting the router are firmly plugged in "
						+ "and power is getting to the router");
				System.out.println("Did that fix the problem? (yes or no)");
				do {
					thirdResponse = result.nextLine();
					while(!thirdResponse.equals("yes") && !thirdResponse.equals("no"))
					{
						System.out.println("Invalid Response. Try again.");
						break;
					}
				} while (!thirdResponse.equals("yes") && !thirdResponse.equals("no"));
				if (thirdResponse.equals("no"))
				{
					//Checking if moving the computer closer to the router fixes the problem.
					System.out.println("Fourth Step: Move the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem? (yes or no)");
					do {
						fourthResponse = result.nextLine();
						while(!fourthResponse.equals("yes") && !fourthResponse.equals("no"))
						{
							System.out.println("Invalid Response. Try again.");
							break;
						}
					} while (!fourthResponse.equals("yes") && !fourthResponse.equals("no"));
					if (fourthResponse.equals("no"))
					{
						//Nothing has worked, so contact your ISP.
						System.out.println("Contact your ISP");
					}
					else if (fourthResponse.equals("yes"))
					{
						//Moving the computer fixed the problem.
						System.out.println("Looks like moving the computer closer worked");
					}
				}
				else if (thirdResponse.equals("yes"))
				{
					System.out.println("Looks like connecting the cables worked");
				}
			}
			else if (secondResponse.equals("yes"))
			{
				System.out.println("Looks like rebooting the router worked");
			}
		}
		else if (firstResponse.equals("yes"))
		{
			System.out.println("Looks like rebooting the computer worked");
		}
		//Closing the scanner object		
		result.close();
		
	}
}
