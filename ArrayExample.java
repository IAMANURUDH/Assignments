/**
 * 
 */
package com.edu.users;
import java.util.Arrays;
/**
 * @author AnurudhGupta
 *
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[4];
		a[0] = "Cat";
		a[1] = "Bat";
		a[2] = "Rat";
		a[3] = "Computer";
		
		String b[] = {"Cat","Bat","Rat","Computer"};
		
			Arrays.sort(b);
			for(int j = 0; j< b.length; j++) {
				System.out.println(b[j]);
			}
		}
}
