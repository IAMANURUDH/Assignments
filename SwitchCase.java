/**
 * 
 */
package com.hughes.exercise;
import java.util.Scanner;
/**
 * @author T00782
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex-1
		String str = "Hello";
		switch(str) {
		case "Hell":{
			System.out.println("Not Matched");
			break;
		}
		case "Hello":{
			System.out.println("Matched");
			break;
		}
		default:
			System.out.println("Invalid Value");
			
		}
		
		//Ex-2
		String name = "Anurudh";//literal way of creating string
		String name1 = "anurudh";
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("It is equal");
		}
		else {
			System.out.println("It is not equal");
		}
		
		//Ex-3
		String lastName = new String("  Gupta");//Object way of creating string
		System.out.println("Last Name : "+lastName);
		System.out.println("Last Name Length : "+lastName.length());
		System.out.println("Is Last Name Empty : "+lastName.isEmpty());
		System.out.println("Replace u with i : "+lastName.replace('u', 'i'));
		System.out.println("Index of : "+lastName.indexOf('t'));
		System.out.println("Remove space : "+lastName.trim());
		System.out.println("Substring : "+lastName.substring(0,3));//always ending index should be +1
		
		//Ex-4
		char c[]={'A','n','u','r','u','d','h'};
		System.out.println(c);
		
		//Ex-5
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your E-mail : ");
		String str2 = sc.next();
		if(str2.indexOf('@')==-1 && str2.indexOf('.')==-1) {
			System.out.println("It is invalid");
		}
		else {
			System.out.println("It is valid");
		}
		System.out.println(str2);
	}
	

}
