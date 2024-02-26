/**
 * 
 */
package com.edu.day5;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Anurudh Gupta
 *
 */
public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> newtable = new Hashtable<>();
		newtable.put(0, "Srinivas");
		newtable.put(1, "srinivas");
		newtable.put(2, "laptop");
		newtable.put(3, "Laptop");
		newtable.put(4, "Edu");
		newtable.put(5, "Tech");
		newtable.put(6, "Design");
		
		HashMap<String,Integer> newmap = new HashMap<>();
		for(int key : newtable.keySet()) {
			String value = newtable.get(key).toLowerCase();
			if(newmap.containsKey(value)) {
				System.out.println(newtable.get(key) + " found at index " + key + " and "+ newmap.get(value));
			} else {
				newmap.put(value,key);
			}
		}
	}
}
