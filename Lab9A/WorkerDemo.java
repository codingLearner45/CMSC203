/*
 * Class: CMSC203 


 * Instructor: Gary Thai
 * Description: (Classes Lab 9A).
 * Displays the information about the worker.
 * Due: 4/15/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
/**
   This program demonstrates a solution to 
   the Employee and ProductionWorker Classes 
   programming challenge.
*/

public class WorkerDemo
{
   public static void main(String[] args)
   {
      String shift;  // To hold a shift value
      
      // Create a ProductionWorker object and pass the initialization
      // data to the constructor.
      ProductionWorker pw =
           new ProductionWorker("John Smith", "123-A", "11-15-2005",
                                ProductionWorker.DAY_SHIFT, 16.50);
      
      // Display the data.
      System.out.println("Here's the first production worker.");
      System.out.println(pw);
      
      // Create another ProductionWorker object and use the
      // set methods.
      ProductionWorker pw2 = new ProductionWorker();
      pw2.setName("Joan Jones");
      pw2.setEmployeeNumber("222-L");
      pw2.setHireDate("12-12-2005");
      pw2.setShift(ProductionWorker.NIGHT_SHIFT);
      pw2.setPayRate(18.50);
      
      // Display the data.
      System.out.println("\nHere's the second production worker.");
      System.out.println(pw2);
   }
}