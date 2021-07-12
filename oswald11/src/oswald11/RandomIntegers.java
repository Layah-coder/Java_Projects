//Leah Oswald SPC ID# 2420610
//Program that creates an ArrayList of random integers, shuffles integers, and displays integers.
//Prompts user enter a number and display the number if it is in the list.
//Displays largest and smallest integer in list.

package oswald11;
//Needed java utilities for arraylist, random number generator, and input.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomIntegers {

	public static void main(String[] args) {
		//Variables to hold random integer and user input.
		int num, userNum;
		Scanner input = new Scanner(System.in);
		//Create arrayList called numbers of object data type Integer.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//Create random object called random.
		Random random = new Random();
		//Increments to 15.
		for (int i = 0; i < 15; i++) {
			//Generates number from 20-40 inclusively and assigns to num.
			num = random.nextInt(21) + 20;
			//Adds num to arraylist called numbers.
			numbers.add(num);
			
		}
		//Shuffle arraylist, numbers.
		java.util.Collections.shuffle(numbers);
		// Display arraylist on one line.
		System.out.println(numbers + " ");
		//Prompt user to enter a number.
		System.out.println("Enter a number from 20-40: ");
		//Assign next int to userNum.
		userNum = input.nextInt();
		//Use contains method to see if userNum is in the arraylist numbers.
		boolean answer = numbers.contains(userNum);
		
		if (answer) {
			//Use indexOf and get method to find and display number from list.
			System.out.println(numbers.get(numbers.indexOf(userNum)) + " is in the list of integers.");
		}
		//Alert user number was not found.
		else {
			System.out.println(userNum + " is NOT in the list of integers.");
		}
		//Display highest integer with the max method.
		System.out.println("The highest integer is " + java.util.Collections.max(numbers));
		//Display the lowest integer with the min method.
		System.out.println("The lowest integer is " + java.util.Collections.min(numbers));
		
		//Close scanner input.
		input.close();
	}

}
