/*
 * Class: CMSC203
 * Project 2: RandomNumberGuesser.


 * Instructor: Gary Thai.
 * Description: This project randomly generates a number that the user has to guess
 * in order to win the guessing game.
 * Due: 2/25/2022.
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import java.util.Scanner;
public class RandomNumberGuesser {
	public static void main(String[] args) {
		int nextGuess, randNum, numberGuess;
		int lowGuess;
		int highGuess;
		String response = "";
		RNG.scan = new Scanner(System.in);
		System.out.println("Welcome to the Random Number Generator!");
		//Program start
		
		do {
			lowGuess = 1;
			highGuess = 100;
			//generate random #
			randNum = RNG.rand();
			//reset count
			RNG.resetCount();
			numberGuess = RNG.getCount();
			do {
				System.out.println("What is your guess?"); //Prompting user input
				
				nextGuess = RNG.scan.nextInt();
				if (RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
					if (nextGuess < randNum) {
						numberGuess++;
						System.out.println("Number of guesses is " + numberGuess);
						lowGuess = nextGuess;
						System.out.println("Your guess is too low."); //Guess is too low
						System.out.println("Enter your guess between " + lowGuess + " and " +
						 highGuess); //requesting the user for input between low and high
					} else if (nextGuess > randNum) {
						numberGuess++;
						System.out.println("Number of guesses is " + numberGuess); //printing the number of guesses
						highGuess = nextGuess;
						System.out.println("Your guess is too high."); //Displaying that the guess is too high
						System.out.println("Enter your guess between " + lowGuess + " and " +
								 highGuess); //requesting the user for input between low and high
					}
				} 
			} while (randNum != nextGuess); //loops when user guesses incorrectly
			if (randNum == nextGuess){
				System.out.println("Congratulations! You guessed correctly."); //user guess correctly
				System.out.println("Try again? (Yes or no)");
				response = RNG.scan.next();
				
				do {
					
					while(!response.equals("Yes") && !response.equals("no")){
						System.out.println("Invalid Response. Try again.");
						response = RNG.scan.next();
						//break;
					}
				} while (!response.equals("Yes") && !response.equals("no"));
				
			}
			
		}while(response.equals("Yes")); //looping because the user want to continue to play
		

				System.out.println("Thanks for playing."); //Displaying final message
	}
}
