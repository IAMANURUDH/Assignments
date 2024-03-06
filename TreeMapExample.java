/**
 * 
 */
package com.edu.day5;

import java.util.TreeMap;

/**
 * @author T00782
 *
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm1 = new TreeMap();
		tm1.put(50072, "Huderabad");
		tm1.put(50001, "Punjab");
		
		TreeMap tm = new TreeMap();
		tm.put(1, "Anurudh");
		tm.put(2, "Anshika Singh");
		tm.put(3, "Atishay Jain");
		tm.put(4, "Ayush Gupta");
		//
		for(Object p : tm.descendingKeySet() ) {
			System.out.println(p + "= " + tm.get(p));			
		}
	}
}
