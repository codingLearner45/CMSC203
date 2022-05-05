/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 11).
 * Calculates the geometric and harmonic recursive methods.
 * Due: 5/6/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import java.util.Scanner;

/**
   This program calculates the geometric and
   harmonic progression for a number entered
   by the user.
*/

public class Progression
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);

      System.out.println("This program will calculate " +
                         "the geometric and harmonic " +
                         "progression for the number " +
                         "you enter.");
                         
      System.out.print("Enter an integer that is " +
                       "greater than or equal to 1: ");
                       
      int input = keyboard.nextInt();

      // Match the method calls with the methods you write
      int geomAnswer = geometricRecursive(input);
      double harmAnswer = harmonicRecursive(input);

      System.out.println("Using recursion:");
      
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
                         
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);

      // Match the method calls with the methods you write
      geomAnswer = geometricIterative(input);
      harmAnswer = harmonicIterative(input);

      System.out.println("Using iteration:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
                         
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);
   }

   // ADD LINES FOR TASK #2 HERE
   // Write the geometricRecursive method
   
   public static int geometricRecursive(int num)
   {
	   if (num == 0)
	      {
	         return 1;
	      }
	      else
	      {
	         return (geometricRecursive(num - 1) * num);
	      }
   }
   
   // Write the geometricIterative method
   
   public static int geometricIterative(int num)
   {
	   int x = 1;
	   for (int i = 1; i < num; i++)
	   {
		   
		   x *= i;
	   }
	   return x * num;
	   
   }
   
   // Write the harmonicRecursive method
   
   public static double harmonicRecursive(double num)
   {
	   
	   if (num == 0)
	      {
	         return 1;
	      }
	      else
	      {
	    	  return ((harmonicRecursive(num - 1)) * (1.0/num));
	      }
   }
   
   // Write the harmonicIterative method
   public static double harmonicIterative(double num)
   {
	   double x = 1;
	   for (int i = 1; i < num; i++)
	   {
		   double temp = 1.0/i;
		   x *= temp;
	   }
	   return x * (1/num);
	   
   }
}