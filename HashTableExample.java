/**
 * 
 */
package com.edu.day5;

import java.util.Hashtable;
import java.util.HashMap;
/**
 * @author Anurudh Gupta
 *
 */
public class HashTableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		ht.put("K1", "Anurudh");
		ht.put("K2", "Anshika");
		ht.put("K4", "Abhay");
		//ht.put("K4", "Astha");
		System.out.println(ht);
		System.out.println(ht.keySet());//Will display only keys
		System.out.println(ht.values());//will display values
		System.out.println(ht.get("K2"));//will display value for particular key
		ht.replace("K4", "Abhay" ,"Anurudh");
		System.out.println(ht);
		
		//Task-1
		String arr[] = {"Bat","Rat","Cat","Mat","TV","Laptop"};
		
		HashMap hm = new HashMap();
		for(int i=0;i<arr.length; i++) {
			hm.put(i, arr[i]);
		}
		System.out.println(hm);
		
		//Task-2
		Hashtable<Integer,String> newtable = new Hashtable<>();
		newtable.put(0,"Srinivas");
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
				System.out.println(newtable.get(key) + " found at index " + key + ","+ newmap.get(value));
			} else {
				newmap.put(value,key);
			}
		}
	}
}
