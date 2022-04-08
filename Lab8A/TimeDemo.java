/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Classes Lab 8).
 * Implementing more classes and objects, modified the file.
 * Due: 4/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import java.util.Scanner;

/**
   This program demonstrates the Time class.
*/

public class TimeDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char answer = 'Y';
      String enteredTime;
      String response;

      while (answer == 'Y')
      {
         
    	 System.out.print("Enter a military time " +
                          "using the ##:## format: ");
         enteredTime = keyboard.nextLine();
         Time now = new Time (enteredTime);
         System.out.println("Do you want to enter " +
                            "another (Y/N)? ");
         response = keyboard.nextLine();
         answer = response.charAt(0);
         
   
         
         if(answer == 'N')
         {
       	  System.out.println("Thanks for playing the game!");
       	  System. exit(0);

         }
         
         if(answer != 'N' || answer != 'Y')
        	 
         {
        	 System.out.println("Invalid input. Try again.");
        	  System.out.println("Do you want to enter " +
                      "another (Y/N)? ");
        	  response = keyboard.nextLine();
              answer = response.charAt(0);
         }
      }
      
      
   }
}