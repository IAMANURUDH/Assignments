/**
 * Q.) Print the character array in reverse order?
 * I/P : ['a','n','u','r','u','d','h']
 */
package com.github.assignments;

/**
 * @author Anurudh Gupta
 *
 */
public class Taskthree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a','n','u','r','u','d','h'};
		
		for(int i=ch.length -1 ; i>=0; i--) {
			System.out.println(ch[i]);
		}
	}
}
