/**
 * Manipulating the data using these options
 * Enter '1' to insert or add the data.
 * Enter '2' to delete the data.
 * Enter '3' to display the data.
 * Enter '4' to display the duplicate data.
 */
package com.github.assignments;
import java .util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/**
 * @author Anurudh Gupta
 *
 */
public class Taskfive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();//Create a new array list
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//Use a scanner class to take input from the user.
		
		while(true) {
			System.out.println("Enter your choice : \n\n1.)Add the data \n2.)Delete the data \n3.)Display the data \n4.)Display the duplicates\n5.)Exit\n");
			int num = sc.nextInt();//Enter your choice to add,delete or display the data.
		switch(num)
		{
		case 1:
			System.out.println("Insert the data ");
			sc.nextLine();
			String insertData = sc.nextLine();
			list.add(insertData);//Add the data to the list.
			System.out.println("Data added successfully\n");
			break;
		case 2:
			if(list.isEmpty()) { //If there is no data in the list.
				System.out.println("Empty list");
				break;
			}
			System.out.println("Enter list to delete : ");
			sc.nextLine();
			String deleteData = sc.nextLine();
			if(list.remove(deleteData)) {
				System.out.println("List data deleted successfully\n");
			} else {
				System.out.println("This data is not in this list\n");
			}
			break;		
		case 3:
			if(list.isEmpty()) {
				System.out.println("List is Empty");
			} else {
				System.out.println("List Data : ");
				for(String data : list) { //Use forEach loop to display all the data that is stored in the list.
					System.out.println(data);
				}
			}
			break;
		case 4:
			Set<String> sets = Duplicates(list);
			if(list.isEmpty()) {
				System.out.println("No Duplicates\n");
			} else {
				for(String set : sets) {
					System.out.println(set);
				}
			}
			break;
		case 5:
			System.out.println("Exit");
			System.exit(0);//To exit the program 
		default: 
			System.out.println("Invalid choice");
	}
}
	}
	private static Set<String> Duplicates(List<String> list) {
		// TODO Auto-generated method stub
		Set<String> SetData = new HashSet<>();
		Set<String> sets = new HashSet<>();
		
 		for (String data : list) { //To find the duplicate data in the list.
 			if(!SetData.add(data))
 			{
 				sets.add(data);
 			}
 		}
 		return sets;
	}
}
