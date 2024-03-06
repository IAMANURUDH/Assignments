/**
 * 
 */
package com.hsc.assessment;
import java.util.Scanner;
/**
 * @author T00782
 *
 */
public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//Take input from user
		String str2 = "";//Initialize empty string
		int count = 1;
		
		for(int i=str.length()-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			str2 += ch; //Append the character to the string
			str2 += count;//Append the number to the string
			count++;//Increment the number
		}
		System.out.println(str2);//Print the final output
	}
}
