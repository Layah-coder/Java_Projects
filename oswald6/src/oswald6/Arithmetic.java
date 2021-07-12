//Leah Oswald SPC ID#2420610
//Program that uses a method to calculate user input.



package oswald6;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		//Create input scanner.
		Scanner input = new Scanner(System.in);
		//Prompt user for doubles.
		System.out.println("Enter two double numbers: ");
		//Assign user input to double variables num1 and num2.
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		//Call method passing user input as arguments.
		arithmetic(num1, num2);
		
		
		//Close input scanner.
		input.close();

	}
	//Void method named arithmetic that takes two doubles as parameters.
	public static void arithmetic(double num1, double num2) {
		//Calculate and assign to variables.
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		//Display the results formatted to 3 decimal places.
		System.out.printf("Sum: %.3f \nDifference: %.3f \nProduct: %.3f \nQuotient: %.3f", sum, difference, product, quotient);
	}

}
