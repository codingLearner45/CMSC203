/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Driver and Data Element Lab 2).
 * Programming multiple classes and loops.
 * Due: 2/11/2022
 * Platform/compiler:
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

package secondLab;
import java.io.IOException;
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Movie abc = new Movie();
		Scanner response = new Scanner (System.in);
		String title, rating, answer;
		int tickets;
		//implementing do-while loop to prompt user to answer questions while answer isn't no.
		do {
			System.out.println("Which movie are you watching?");
			title = response.nextLine();
			System.out.println("What rating is the movie?");
			rating = response.nextLine();
			System.out.println("How many tickets did the movie sell?");
			tickets = response.nextInt();
			response.nextLine();
			//adds title, rating, and tickets based on user input
			abc.setTitle(title);
			abc.setRating(rating);
			abc.setSoldTickets(tickets);
			System.out.println(abc.toString());
			System.out.println("Do you want to enter another movie? (yes or no)");
			answer = response.nextLine();
		}while (!answer.equals("no"));
		if (answer.equals("no")) //ending the program when answer is no
		{
			System.out.println("Goodbye");
		}
		
	}
	

}
