/**
 * WAP to remove duplicate elements from a given array and return the updated array length.
 * After removing the duplicate elements the program should return the new length of the array.
 * I/P : [20,20,30,40,50,50,50]
 */

package com.github.assignments;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anurudh Gupta
 *
 */
public class Tasksix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int arr[] = {20, 20, 30, 40, 50, 50, 50};
		       
		       int length = duplicate(arr); //Calling the method to store the new length into "length".
		       System.out.println("Length of the array is " + length);
		   }
		   public static int duplicate(int[] nums) { //Method to remove duplicates from array
		       Set<Integer> sets = new HashSet<>(); //HashSet to store unique values
		       for (int num : nums) { //Add element to the HashSet from the array
		           sets.add(num);
		       }
		       return sets.size(); //Return the size of new array
	}
}
