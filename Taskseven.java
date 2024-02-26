/**
 * Program to find duplicate numbers in an array if it contains multiple duplicates ?
 * I/P : [2,4,2,6,7,5,4,2]
 */
package com.github.assignments;
import java.util.Arrays;
/**
 * @author Anurudh Gupta
 */
public class Taskseven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int arr[] = {2,4,2,6,7,5,4,2};
		       duplicates(arr); //Call the method to display the result.
		   }
		   public static void duplicates(int[] arr) { 
		       Arrays.sort(arr); //Sort the array
		       System.out.println("Duplicate numbers in the array : ");
		       for (int i = 0; i < arr.length - 1; i++) { 
		           if (arr[i] == arr[i + 1]) { //Check current number and next number is equal or not.
		               System.out.println(arr[i]);
		               while (i < arr.length - 1 && arr[i] == arr[i + 1]) { //Skip to the next different number.
		                   i++;
		               }
		           }
		       }
		   }
		}
