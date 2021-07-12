//Leah Oswald SPC ID# 2420610
//Program that prompts user for a price and quantity.
//Program will continue to prompt user until they enter 0 and will display a total.

package oswald5;

import java.util.Scanner;

public class CashierTerminal {
	public static void main(String[] args) {
		//Declared variables.
		double price = 0, subtotal, total = 0;
		int quantity;
		//Create scanner.
		Scanner userInput = new Scanner(System.in);
		//Prompt user to enter the price of an item or 0.
		System.out.println("Enter item price or zero to quit");
		price = userInput.nextDouble();
		
		//While the user has not entered 0 continue while loop.
		while(price != 0)
		{
			//Prompt user to enter the quantity.
			System.out.println("Enter quantity for this item");
			quantity = userInput.nextInt();
			//Calculate subtotal.
			subtotal = price*quantity;
			//Display subtotal.
			System.out.printf("Subtotal for this item is $%.2f", subtotal);
			//Add subtotal to the accumulator variable total.
			total += subtotal;
			//Prompt user for price again.
			System.out.println("\n\nEnter item price or zero to quit");
			price = userInput.nextDouble();
		}
		//Print the results of total.
		System.out.printf("Total is $%.2f", total);
		
		//Close userInput scanner.
		userInput.close();
	}

}
