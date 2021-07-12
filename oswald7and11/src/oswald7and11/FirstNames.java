//Leah Oswald SPC ID# 2420610
//Program that uses an array to store names from user input.
//Prints the names.
//Passes the array to a method.
//Sorts the array and creates an arraylist of strings.
//Inserts a name, removes a name, displays new list of names.

package oswald7and11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstNames {

	public static void main(String[] args) {
		
		//Declare a new array names that holds 6 strings.
		String [] names = new String [6];
		Scanner input = new Scanner(System.in);
		//Prompt user for 6 names.
		System.out.println("Enter six first names");
		//Add names from one line to array names.
		for (int i = 0; i < 6; i++) {
			names[i] = input.next();
		}
		//Foreach that processes the elements of names and displays them with spaces on one line.
		for (String i: names) {
			//Displays element with space.
			System.out.print(i + " ");
		}
		//Calls a Method with array names as an argument.
		arrayList(names);
		
		input.close();
		

	}
	//Void method that accepts a string array as a parameter.
	public static void arrayList(String [] array) {
		System.out.println("\nSorted array of names");
		//Sorts the array or strings in ascending alphabetical order.
		Arrays.sort(array);
		//Creates string arraylist names.
		ArrayList<String> names = new ArrayList<>();
		//Loop to populate arraylist with strings from array.
		for (int i = 0; i < array.length; i++) {
			//Displays the array list after using sort to match sample output.
			System.out.print(array[i] + " ");
			//Adds array element to arraylist names.
			names.add(array[i]);
			
		}
		//Adds name Steve to start of arraylist.
		names.add(0, "Steve");
		//Removes the name at the end of arraylist.
		names.remove(names.size()- 1);
		System.out.println("\nFinal list of names");
		//Foreach loop that processes arraylist and displays the names on one line separated by spaces.
		for(String i : names) {
			System.out.print(i + " ");
		}
	}

}
