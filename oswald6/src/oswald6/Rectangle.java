//Leah Oswald SPC ID# 2420610
//Program that uses two methods.
//One void that calculates and prints the area of a rectangle.
//The other that calculates and returns the length of the diagonal.
//Program will prompt user to enter dimensions of a rectangle as a double data type.
//Displays results with 4 decimal places.

package oswald6;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		//Create input scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt user for dimensions of a rectangle as a double data type.
		System.out.println("Enter the lenght and width of the rectangle: ");
		
		//Assign user input to double variables dimension1 and dimension2.
		double dimension1 = input.nextDouble();
		double dimension2 = input.nextDouble();
		
		//Call method passing user input as arguments.
		area(dimension1, dimension2);
		
		//Display the returned value of the diagonal method with 
		//dimension1 and dimension2 as arguments.
		//Format to 4 decimal places.
		System.out.printf("\nDiagonal length: %.4f", diagonal(dimension1, dimension2));
		
		
		//Close input scanner.
		input.close();

	}
	//Void method that accepts doubles as the parameters and assigns to variables dimesnion1 and dimesntion2.
	public static void area(double dimension1, double dimension2) {
		//Calculate area and assign to variable.
		double area = dimension1 * dimension2;
		//Display area with 4 decimal places.
		System.out.printf("Area: %.4f", area);
		
	}
	//Method that returns a double.
	//Accepts doubles as parameters and assign to variables dimension1 and dimesnion2.
	public static double diagonal(double dimension1, double dimesnion2) {
		//Calculate diagonal by finding the hypotenuse.
		// square root of dimension^2 + dimesnion2^2
		double diagonal = Math.sqrt(Math.pow(dimension1, 2) + Math.pow(dimesnion2, 2));
		//Return the value of diagonal.
		return diagonal;
	}

}
