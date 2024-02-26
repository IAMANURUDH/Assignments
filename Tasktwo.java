/**
 * Q.) throw NumberFormatException otherwise if it is character,throw CharacterException else print valid String?
 * I/P : "2" Or "a" Or "Anurudh" 
 */
package com.github.assignments;
import java.util.Scanner;
/**
 * @author Anurudh Gupta
 *
 */
public class Tasktwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				String ip = sc.nextLine();
		 
		        try {
		            if (ip.matches("\\d+")) 
		            {
		                throw new NumberFormatException("Invalid input Number : " + ip);
		            } 
		            else if (ip.length() == 1 && Character.isLetter(ip.charAt(0))) 
		            {
		                throw new CharacterException("Invalid input Character : " + ip);
		            } 
		            else {
		                System.out.println("Valid input String: " + ip);
		            }
		        } catch (NumberFormatException | CharacterException e) 
		        {
		            System.out.println("Exception : " + e.getMessage());
		        }
		    }
		    @SuppressWarnings("serial")
			static class CharacterException extends Exception 
		    {
		        public CharacterException(String message) 
		        {
		            super(message);
		        }
		    }
		}
