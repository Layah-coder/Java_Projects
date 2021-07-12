//Leah Oswald SPC ID# 2420610
//Program that will calculate a grocery bill using methods.
//Main method will prompt user to enter items, price, quantity, and taxable.
//Main method will accumulate and display the bill total formatted to 2 decimal places.
//Item method will calculate and display subtotal, tax, and total for each item.
//Item method will return the total.

package oswald6;

import java.util.Scanner;

public class GroceryBill {

	public static void main(String[] args) {
	
		//Declare double variable.
		double grandTotal = 0.0;
		//Create input scanner.
		Scanner input = new Scanner(System.in);
		//Prompt user for how many items.
		System.out.print("How many different items are being purchased? ");
		//Assign user input to integer variable, items.
		int items = input.nextInt();
		//For loop that continues until user has been prompted for all items.
		for (int i = 1; i <= items; i++) {
			//Prompt user for price of item.
			System.out.printf("Enter the price of item %d ", i);
			//Assign user input to double price.
			double price = input.nextDouble();
			System.out.print("Enter qunatity of this item ");
			//Assign user input to integer variable, quantity.
			int quantity = input.nextInt();
			//Prompt user for true or false.
			System.out.print("Is the item taxable true/false? ");
			//Assign to boolean isTaxable.
			boolean isTaxable = input.nextBoolean();
			//Call item method with price, quantity, and isTaxable as arguments.
			//Assign to total.
			double total = item(price, quantity, isTaxable);
			//Add total to accumulator, grandTotal.
			grandTotal += total; 

	

		}
		//Display the grand total formatted to 2 decimal.
		System.out.printf("Please Pay $%.2f", grandTotal);


		
		
		//Close input scanner.
		input.close();

	}
	//Method called items with parameters for a double price, int quantity, and boolean isTaxable.
	public static double item(double price, int quantity, boolean isTaxable){
		//Constant double for sales tax.
		final double TAX = .07;
		//Double variable to store sales tax amount.
		double salesTax = 0;
		//Calculate the subtotal.
		double subTotal = price * quantity;
		//Display the subtotal with 2 decimal places.
		System.out.printf("Subtotal $%.2f", subTotal);
		//Check if item is taxable.
		if (isTaxable) {
			//Calculate sales tax amount.
			 salesTax = subTotal * TAX;
			 //Display sales tax amount to 2 decimal places.
			 System.out.printf("\nSales Tax $%.2f", salesTax);
		}
		//If not taxable display default sales tax amount formatted to 2 decimal places.
		else {
			 System.out.printf("\nSales Tax $%.2f", salesTax);
		}
		//Calculate total.
		double total = subTotal + salesTax;
		//Display total formatted to 2 decimal places.
		System.out.printf("\nTotal $%.2f\n", total);
		//Return total to main method.
		return total;
	}

}
