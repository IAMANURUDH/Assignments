/**
 * Q.)Print this string array in ascending order?
 * I/P : ["Cat","Bat","Rat","Computer"]
 */
package com.github.assignments;

import java.util.Arrays;

/**
 * @author Anurudh Gupta
 *
 */
public class Taskfour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"Cat","Bat","Rat","Computer"};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
