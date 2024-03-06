package com.hsc.assessment;

import java.util.Scanner;

/**
 * @author T00782
 *
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
