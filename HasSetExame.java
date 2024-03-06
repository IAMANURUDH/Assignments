/**
 * 
 */
package com.edu.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author T00782
 *
 */
public class HashSetExample1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(67);
		al.add(67);
		al.add(876);
		//
		//
		System.out.println(al);
		@SuppressWarnings("rawtypes")
		HashSet st = new HashSet();
		st.add(new Integer(789));
		st.add(new Integer(1789));
		st.add(new Integer(9));
		st.add(new String("Anurudh"));
		st.add(null);
		st.add(" ");
		st.addAll(al);
		System.out.println(st);
		System.out.println("Size of HashSet : " + st.size());
		System.out.println("Array of HashSet : " + st.toArray()[0]);
		//
		//
		@SuppressWarnings("rawtypes")
		Iterator i = st.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
