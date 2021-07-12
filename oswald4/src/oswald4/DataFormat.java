//Leah Oswald SPC ID# 2420610
//Program that will use a constant and variables to generate output using the printf() method.

package oswald4;

public class DataFormat {

	public static void main(String[] args) {
		
		//Assigns .07 to constant TAXRATE.
		final double TAXRATE = .07;
		//Assigns to a String.
		String earBuds = "ear buds";
		//Assigns to an int variable.
		int quantity = 3;
		//Assigns to a double variable.
		double price = 149.99;
		//Assigns to character data type, char.
		char ch = 'A';
		//Assign true to boolean variable.
		boolean isTaxable = true;
		//Assigns values to double variables.
		double subtotal = 0.0;
		double salesTax = 0.0;
		double total = 0.0;
		
		//Use printf() to format a string, decimal integer, and floating-point number(w/ two decimal places).
		System.out.printf("Purchase: %s, quantity %d @ $%.2f\n", earBuds, quantity, price);
		//Use printf() to format a char and boolean.
		System.out.printf("Dept %c, taxable? %b\n", ch, isTaxable);
		//Uses printf() to format a floating-point number to two decimals and
		//calculates subtotal.
		System.out.printf("Subtotal $%.2f\n", subtotal = quantity * price);
		//Uses printf() to format a floating-point number to two decimals and
		//calculates salesTax.
		System.out.printf("7 %% sales tax is $%.2f\n", salesTax = subtotal * TAXRATE);
		//Uses printf() to format a floating-point number to two decimals and
		//calculates total.
		System.out.printf("Total payable $%.2f", total = subtotal + salesTax);
		

	}

}
