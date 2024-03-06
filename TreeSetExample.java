/**
 * 
 */
package com.edu.day5;
import java.util.TreeSet;
/**
 * @author T00782
 *
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(89);
		ts.add(8);
		ts.add(18);
		ts.add(83);
		try {
		TreeSet ts1 = (TreeSet) ts.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.higher(18));
		ts.pollFirst(); //Removes the first element from set.
		System.out.println(ts.descendingSet());
	}
}
