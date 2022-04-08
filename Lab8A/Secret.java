/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Classes Lab 8).
 * Reading from a text file to decrypt a code, Created by me.
 * Due: 4/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Secret {
	public static void main(String args[])
	{
		try {
			File sec = new File("secret.txt");
			Scanner read = new Scanner(sec);
			String iterate = read.nextLine();
			String code = "";
			String[] token = iterate.split(" ");
			for(int i = 0; i < token.length; i+=5)
			{
				code += Character.toUpperCase(token[i].charAt(0));
			}
			System.out.print(code);
		} catch(FileNotFoundException e) {
			System.out.println("An error occured.");
		}
		
	}
	
}
