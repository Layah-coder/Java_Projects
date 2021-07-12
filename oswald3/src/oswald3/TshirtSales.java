// Leah Oswald SPC ID#2420610
//Program allows user to enter how many shirts they want to buy. 
//Then prints out the subtotal, shipping, and total cost of the order.

package oswald3;

import java.util.Scanner;

public class TshirtSales {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// create double variables for shipping and subtotal
		double shipping = 1.00;
		double subtotal = 0;

		// prompt user to enter how many t-shirts
		System.out.println("How many of Tammy's Tees T-Shirts would you like to purchase? ");

		// assign user input to int variable quantity
		int quantity = input.nextInt();

		// test user input to see if ordering less then 5 t-shirts
		if (quantity < 5) {
			// multiply and assign to subtotal
			subtotal = quantity * 17.00;
		}
		// test user input to see if ordering between 5-9 t-shirts
		else if (quantity < 10 && quantity > 4) {
			// multiply and assign to subtotal
			subtotal = quantity * 13.00;
		}
		// test user input to see if ordering between 10-19 t-shirts
		else if (quantity < 20 && quantity > 9) {
			// multiply and assign to subtotal
			subtotal = quantity * 10.00;
		}
		// if other conditions are not met then this is the default choice
		else {
			// multiply and assign to subtotal
			subtotal = quantity * 8.00; 
			}
		// test is ordering more then 12 shirts
		if (quantity < 12) {
			// multiply and assing to shipping
			shipping = quantity * 1.00;
		}
		// default choice if other condition not met
		else {
			shipping = 0.00;
		}
		// calculate total
		double total = subtotal + shipping;

		
		//double price
		//if (qty > = 10) {
		// price = 10.00;
		//}else if (qty >= 10) {
		// price = 13.00;
	//}else {
		//price = 8.00;
		//}
		// double ship = (qty >= 12) ? 0.0 qty;
		input.close();

		// display results
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Shipping: $" + shipping);
		System.out.println("Total cost: $" + total);
	}
}
