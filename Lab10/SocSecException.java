/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 10).
 * Constructor that prints the error.
 * Due: 4/29/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class SocSecException extends RuntimeException{
	public SocSecException(String error)
	{
		super("Invalid social security number" + ' ' + error);
	}
}
