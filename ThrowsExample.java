package com.hsc.exercisetwo;

import java.io.IOException;
/**
 * @author T00782
 *
 */
class Mat{
	public void myMethod() throws IOException,NullPointerException{
		System.out.println("My method activated");
		throw new IOException("IO Error");
	}
}
public class ThrowsExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new Mat().myMethod();
	}
}
