/**
 * 
 */
package com.hsc.assessment;

import java.util.Scanner;

/**
 * @author T00782
 *
 */
public class AssignmentSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isInteger(str)) {
			System.out.println("It is integer");
		}
		else if(isFloat(str)) {
			System.out.println("It is float");
		}
		else if(isString(str)){
			System.out.println("It is String");
		} else {
			System.out.println("Invalid input");
		}
	}

	private static boolean isString(String str) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean isFloat(String str) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean isInteger(String str) {
		// TODO Auto-generated method stub
		return true;
	}

}
