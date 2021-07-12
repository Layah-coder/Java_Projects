/* Leah Oswald SPC ID# 2420610
 * Program that creates an array of ints,
 * displays them on one line with a foreach loop.
 * In a tryblock, prompts user for array index.
 * Has a catch for index out of bounds and a catch for bad inputs.
 */

package oswald12;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		//Small array of 8 elements.
		int[] smallArray = {1, 5, 94, 84, 48, 49, 50, 100};
		//Foreach that displays the array on one line.
		for(int i : smallArray) {
			System.out.print(i + " ");
		}
		Scanner input = new Scanner(System.in);
		//Executes if no runtime errors.
		try {
			//Prompt user for input.
			System.out.print("\nEnter any index of your array ");
			//Assign user input to index.
			int index = input.nextInt();
			//Displys element at array index.
			System.out.print("Element " + index + " is " + smallArray[index]);
		}
		//Executes if index is not in array (index 0-7).
		catch(IndexOutOfBoundsException ex) {
			//Display error message.
			System.out.print("Error. Array index was out of bounds");
		}
		//Executes if bad input.
		catch(Exception ex) {
			System.out.print("Bad input. Try again");
			
		}
		//Always executes.
		finally {
			//Close scanner.
			input.close();
		}

	}

}
