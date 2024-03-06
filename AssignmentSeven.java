/**
 * 
 */
package com.hsc.assessment;

import java.util.Scanner;

/**
 * @author T00782
 *
 */
public class AssignmentSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//Take 1st Input
		int num2 = sc.nextInt();//Take 2nd Input
		int num3 = 0;
		
		for(int i=num; i<=num2; i++ ) {
			num3 = num3 + i;//Incrementing num3 and the value of i
		}
		System.out.println(num3);
	}
}
