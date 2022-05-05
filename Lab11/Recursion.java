/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 11).
 * Methods that calculate the factorial of n.
 * Due: 5/6/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
/**
   This program demonstrates factorials using recursion.
*/

public class Recursion
{
   public static void main(String[] args)
   {
      int n = 7;

      // Test out the factorial
      System.out.println(n + " factorial equals ");
      System.out.println(Recursion.factorial(n));
      System.out.println();
   }
   
   /**
      This is the factorial method.
      @param n A number.
      @return The factorial of n.
   */
   
   public static int factorial(int n)
   {
           
      int temp; 
      System.out.println("Method call -- " + 
      "calculating " + 
      "Factorial of: " + n); 

      
      if (n == 0)
      {
         return 1;
      }
      else
      {
    	  temp = factorial(n - 1);
    	  System.out.println("Factorial of: " + 
    	  (n - 1) + " is " + 
    	  temp); 
    	  return (temp * n);
      }
   }
}
