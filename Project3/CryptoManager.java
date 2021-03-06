/*
 * Class: CMSC203
 * Instructor: Gary Thai.
 * Project 3.
 * Description: This project uses loops, strings, and ASCII codes and tests methods.
 * Java Program: Encrypts and decrypts a phrase using similar approaches.
 * Due: 3/25/2022.
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

package crypto;

import java.nio.charset.CharsetEncoder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CryptoManager {
	private static String message;
	private static String mappedKey;
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		for (int i = 0; i < plainText.length(); i++)
		{
			if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND)
			{
				return false;
			}
		}
		return true;
			
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		String newText = "";
		int offset;
		
		for (int i = 0; i < plainText.length(); i++)
		{
			if (key > RANGE)
			{
				offset = (char)((((int)plainText.charAt(i) + key - LOWER_BOUND) % RANGE) + LOWER_BOUND);
			}
			else
			{
				offset = (char)((int)plainText.charAt(i) + key);
			}
			newText += (char)offset;
		}
		
		return newText;
	}

	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	
	public static String encryptBellaso(String plainText, String bellasoStr) {
		  String encryptedMsg = "";
		  char charAt;
		  int offset;
	      for (int i = 0; i < plainText.length(); i++) {
	    	  charAt = plainText.charAt(i);
	    	  offset = ((int)charAt + (int)bellasoStr.charAt(i % bellasoStr.length()));
	    	  while(offset > (int)UPPER_BOUND) {
	    		  offset -= RANGE;
	    	  }
	    	  encryptedMsg += (char)offset;
	      	
	      }
	      System.out.println("Encrypted bellasoStr: " + encryptedMsg);
	      return encryptedMsg; 
	  }
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		
		String newText = "";
		int offset;
		System.out.println(encryptedText);
		for (int i = 0; i < encryptedText.length(); i++)
		{
			if (key > RANGE)
			{
				offset = (int)encryptedText.charAt(i) - key;
				while(offset < LOWER_BOUND) {
					offset += RANGE;
				}
			}
			else
			{
				offset = (char)((int)encryptedText.charAt(i) - key);
			}
			newText += (char)offset;
		}
		System.out.println("Decrypted caesarStr: " + newText);
		return newText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		
		String decryptedMsg = "";
		  char charAt;
		  int offset;
	      for (int i = 0; i < encryptedText.length(); i++) {
	    	  charAt = encryptedText.charAt(i);
	    	  offset = ((int)charAt - (int)bellasoStr.charAt(i % bellasoStr.length()));
	    	  while(offset < (int)LOWER_BOUND) {
	    		  offset += RANGE;
	    	  }
	    	  decryptedMsg += (char)offset;
	      	
	      }
	      System.out.println("Encrypted bellasoStr: " + decryptedMsg);
	      return decryptedMsg; 
		  
	}
}
