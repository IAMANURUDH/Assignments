/**
 * 
 */
package com.hughes.exercise;

/**
 * @author Anurudh Gupta
 *
 */
public class TryPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "String";
		KnowDataType(input);

		}
		public static void KnowDataType(String input) {
		if(IsInteger(input)) {
		System.out.println("Integer");
		}else if(IsFloat(input)) {
		System.out.println("Float");
		}else if(IsCharacter(input)) {
		System.out.println("Character");
		}else {
		System.out.println("String");
		}
		}
		public static boolean IsInteger(String input) {
		for(int i=0;i<input.length();i++) {
		if(!Character.isDigit(input.charAt(i))) {
		return false;
		}
		}
		return true;
		}
		public static boolean IsFloat(String input) {
		int decimalPoint =0;
		for(int i=0;i<input.length();i++) {
		char c = input.charAt(i);
		if(c=='.') {
		decimalPoint++;
		}
		if(decimalPoint>1) {
		return false;
		}else if(!Character.isDigit(c) && c !='.') {
		return false;
		}else {
		continue;
		}
		}
		return true;
		}
		public static boolean IsCharacter(String input) {
		if(input.length()==1) {
		return true;
		}else {
		return false;
		}
	}
}
