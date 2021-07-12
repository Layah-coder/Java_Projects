//Leah Oswald SPC ID# 2420610
//program that asks user for three dimensions of a box, then calculates 
//and prints the volume and total surface area of the box.

package oswald1and2;

//import to use scanner object
import java.util.Scanner;

public class CalculateBox {

	//create main method
	public static void main(String[] args) {
		
		//create scanner object for input
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter three dimensions of a box
		System.out.print("Enter length of a box: ");
		
		//assigns user input to double variables named length
		double length = input.nextDouble();
		
		//prompt user to enter three dimensions of a box
		System.out.print("Enter width of a box: ");
		
		//assign user input to double variable named width
		double width = input.nextDouble();
		
		//prompt user to enter three dimensions of a box
		System.out.print("Enter height of a box: ");
		
		//assigns user input to double variable named height
		double height = input.nextDouble();
		
		//close scanner
		input.close();
		
		//calculate volume and assign to double variable named volume
		double volume = length * width * height;
		
		//calculate surface area and assign to variable named surfaceArea
		double surfaceArea = 2 * (height * width) + 2 * (height * length) + 2 * (width * length);
		
		//display results
		System.out.print("The volume of the box is " + volume + " and the surface area is " + surfaceArea);
		
	}

}
