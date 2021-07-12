//Leah Oswald SPC ID# 2420610
//First, program will prompt user for their full name.
//Second, program will use methods of class String to then print the number of characters in the name,
//the middle name, and initials.
//Finally, program will print the name in usual alphabetical format.

package oswald4;

import java.util.Scanner;

public class MethodsOfString {

	public static void main(String[] args) {
		
		//Scanner for user input.
		Scanner input = new Scanner(System.in);
		
		//Prompt user for full name.
		System.out.print("Enter a full name: ");
		
		//Assign user input to string fullName.
		String fullName = input.nextLine();		
		
		//Display number of characters in the fullName including spaces.
		System.out.println(fullName.length());
		
		//Use index.Of() to find a space, assign to int variable.
		int findFirstSpace = fullName.indexOf(' ');
		int findLastSpace = fullName.lastIndexOf(' ');
		
		//Find substring between the index 0 and the first space and assign to string firstName.
		String firstName = fullName.substring(0, findFirstSpace);
		
		//Find substring between the spaces and assign to string variable middleName.
		String middleName = fullName.substring(findFirstSpace + 1, findLastSpace);
		
		//Find substring between the last index and the index of the last space.
		String lastName = fullName.substring(findLastSpace + 1);
		
		//Display middle name.
		System.out.println(middleName);
		
		//Display the three initials of the full name by using the substring of the first index of the three strings.
		System.out.println((firstName.substring(0, 1)) + (middleName.substring(0, 1)) + (lastName.substring(0, 1)));
		
		
		//Display the full name in usual alphabetical format.
		System.out.println(lastName + ", " + firstName + " " + middleName);
		
		//Close scanner.
		input.close();

	}

}
