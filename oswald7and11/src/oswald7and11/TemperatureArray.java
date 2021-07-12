//Leah Oswald SPC ID# 2420610
//Main program that generates random int.
//Will store them in an array and pass them to a method.
//Method will print the ints in a table of 6 rows and 5 columns.
//Method will create a second array and store any int under 32, then will return the second array.
//Main program will display how many are in the second array, sort them, and print them.

package oswald7and11;

import java.util.Arrays;

public class TemperatureArray {

	public static void main(String[] args) {
		
		//Create first array that accepts 30 elements.
		int []fahrenheit = new int [30];
		//Going through each element in the array until reaching the length of the array.
		for (int index = 0; index < fahrenheit.length; index++) {
			//Adding a random number from 10-75 to each index.
			fahrenheit[index] = (int)(Math.random() * 66) + 10 ;
		}
		
		System.out.println("Thirty random Fahrenheit temperatures...");
		//Call printArray method and assign the returned array to freezing.
		int[] freezing = printArray(fahrenheit);
		//Display how many elements are in freezing.
		System.out.println("Found " + freezing.length + " temperatures below freezing.");
		System.out.println("Here they are, sorted ascending...");
		//Use the java.util.Arrays class to sort the array.
		Arrays.sort(freezing);
		//Foreach to process freezing and display the results with a space between elements.
		for(int i: freezing)
		{
			System.out.print(i + " ");
		}
	}
	
	//Method that accepts an int array as parameter.
	public static int[] printArray(int[] array) {
		//Variables.
		int count = 0, j = 0;
		//Goes through each index until reaching the end of the array length.
		for (int index = 0; index < array.length; index++) {
			//When no remainder, print the element with seven characters wide and then print a new line.
			//Ensures only 5 elements in a row.
			if ((index + 1) % 5 == 0 ) {
				
				System.out.printf("%7d\n", array[index]);
			}
			//Else print the element with seven characters wide.
			else {
				System.out.printf("%7d", array[index]);
			}
			//Find elements that are below 32 and keep a count variable to create a new array with.
			if(array[index] < 32) {
				count++;
			}
		}
		
		//Second array to hold how many numbers are below 32.
		int[] freezing = new int[count];
		//Foreach to go through the first array.
		for(int i : array ) {
			if (i < 32) {
				//When an element in array is below 32 assign it to the next index of array freezing.
				freezing[j++] = i;
			}
		}
		//Return the second array, freezing.
		return freezing;
	}

}
