/**
 * 
 */
package com.hsc.assessment;

import java.util.Scanner;

/**
 * @author T00782
 *
 */
public class AssugnmentFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//Take the input from user
		
		char ch[] = str.toCharArray();//Convert string to character array
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(ch[i]);//Final output
		}
	}
}
