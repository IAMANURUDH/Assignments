/**
 * 
 */
package com.hsc.assessment;

import java.util.Scanner;
/**
 * @author T00782
 *
 */
public class AssignmentFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//Take the starting value
		int num2 = sc.nextInt();//Take the ending value
		
		for(int i=num; i<=num2; i++) {
			System.out.println(i);//Final output
		}
	}

}
