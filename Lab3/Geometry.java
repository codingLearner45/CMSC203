import java.util.Scanner;
/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Methods Lab 3).
 * Writing and calling methods as well as creating HTML documentation using the javadoc utility.
 * Due: 2/18/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               value = circleArea(radius);
               // TASK #3 Call the circleArea method and
               // store the result in the value variable

               System.out.println("The area of the " +
                                  "circle is ");
               System.out.format("%.2f%n", value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               value = rectangleArea(length, width);
               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable

               System.out.println("The area of the " +
                                  "rectangle is ");
               System.out.format("%.2f%n", value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               value = triangleArea(height, base);
               // TASK #3 Call the triangleArea method and
               // store the result in the value variable

               System.out.println("The area of the " +
                                  "triangle is ");
               System.out.format("%.2f%n", value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();
               
               value = circleCircumference(radius);
               // TASK #3 Call the circumference method and
               // store the result in the value variable

               System.out.println("The circumference " +
                                  "of the circle is ");
               System.out.format("%.2f%n", value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               value = rectanglePerimeter(length, width);
               // TASK #3 Call the perimeter method and
               // store the result in the value variable

               System.out.println("The perimeter of " +
                                  "the rectangle is ");
               System.out.format("%.2f%n", value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();
               value = trianglePerimeter(side1, side2, side3);
               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               
               System.out.println("The perimeter of " +
                                  "the triangle is " );
               System.out.format("%.2f%n", value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
      keyboard.close();
      System.out.print("Thanks for using the program!");
   }
   public static void printMenu()
   {
	   System.out.println("This is a geometry calculator"); 
	   System.out.println("Choose what you would like to calculate"); 
	   System.out.println("1. Find the area of a circle");
	   System.out.println("2. Find the area of a rectangle");
	   System.out.println("3. Find the area of a triangle");
	   System.out.println("4. Find the circumference of a circle");
	   System.out.println("5. Find the perimeter of a rectangle");
	   System.out.println("6. Find the perimeter of a triangle");
	   System.out.println("Enter the number of your choice");
   }
   
   /**
    * @param length (double variable supplied by user to calculate part of the rectangle area)
    * @param width (double variable supplied by user to calculate part of the rectangle area)
    * @return (returns double value of the area of the rectangle) 
    * Calculates the area of a rectangle with the equation length * width
    *
    */
   public static double circleArea(double radius)
   {
	   double area = radius * radius * Math.PI;
	   return area;
   }
   /**
    * @param length (double variable supplied by user to calculate part of the rectangle area)
    * @param width (double variable supplied by user to calculate part of the rectangle area)
    * @return (returns double value of the area of the rectangle) 
    * Calculates the area of a rectangle with the equation length * width
    *
    */
   public static double rectangleArea(double length, double width)
   {
	   double area = length * width; 
	   return area;
   }
   /**
    * @param base (double variable supplied by user to calculate part of the triangle area)
    * @param height (double variable supplied by user to calculate part of the triangle area)
    * @return (returns double value of the area of the triangle) 
    * Calculates the area of a triangle with the equation 0.5 * base * height
    *
    */
   public static double triangleArea(double base, double height)
   {
	   double area = base * height * 0.5;
	   return area;
   }
   /**
    * @param radius (double variable supplied by user to calculate part of the circle circumference)
    * @return (returns double value of the circumference of the circle) 
    * Calculates the circumference of the circle with the equation 2 * pi * radius
    *
    */
   public static double circleCircumference(double radius)
   {
	   double area = 2 * Math.PI * radius;
	   return area;
   }
   
 /**
 * @param length (double variable supplied by user to calculate part of the rectangle perimeter)
 * @param width (double variable supplied by user to calculate part of the rectangle perimeter)
 * @return (returns double value of the perimeter of the rectangle) 
 * Calculates the perimeter of a rectangle with the equation (2 * length) + (2 * width)
 */
public static double rectanglePerimeter(double length, double width)
   {
	   double perimeter = (2*length) + (2*width); 
	   return perimeter;
   }
/**
 * @param side1 (double variable supplied by user to calculate part of the triangle perimeter)
 * @param side2 (double variable supplied by user to calculate part of the triangle perimeter)
 * @param side3 (double variable supplied by user to calculate part of the triangle perimeter)
 * @return (returns double value of the perimeter of the triangle) 
 * Calculates the perimeter of a triangle with the equation side1 + side2 + side3
 */
   public static double trianglePerimeter(double side1, double side2, double side3)
   {
	   double perimeter = side1 + side2 + side3;
	   return perimeter;
   }
   
   // TASK #2 Create the value-returning methods here
   // TASK #4 Write javadoc comments for each method
 
}