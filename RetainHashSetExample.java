/**
 * 
 */
package com.edu.day5;

import java.util.HashSet;

/**
 * @author T00782
 *
 */
public class RetainHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		HashSet st = new HashSet();
		st.add(new Integer(789));
		st.add(new Integer(1789));
		st.add(null);
		st.add("Anurudh");

		HashSet st1 = new HashSet();
		st1.add(new Integer(8589));
		st1.add("ff");
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st.retainAll(st1));
		System.out.println(st);
		System.out.println(st1);
	}
}
