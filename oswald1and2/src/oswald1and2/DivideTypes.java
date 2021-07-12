//Leah Oswald SPC ID# 2420610
//program that accepts two integers from user and performs division, outputs the results.
//user enters an int and a smaller int that is not a factor of the first int.
//program shows the accuracy of data types.


package oswald1and2;

//import to use scanner
import java.util.Scanner;

public class DivideTypes {

	//create main method
	public static void main(String[] args) {
		
		//create scanner object for inputs
		Scanner input = new Scanner(System.in);
		
		//prompt user for an int
		System.out.print("Enter an int data type: ");
		
		//assign user input to next int variable named firstInt.
		int firstInt = input.nextInt();
		
		//prompt user for a short 
		System.out.print("Enter a smaller number, of int data type, that is not a factor of the first: ");
		
		//assign user input to next short variable named dataTypeShort
		int secondInt = input.nextInt();
		
		//close scanner
		input.close();
		
		/* quotient of two int that calculates only how many times the larger int can be divided by the smaller int, NOT including the remainder.
		 * i.e 200 / 9 = 22
		 * if program wanted to display quotient with decimal precision, would need to use floating-point division by initializing data type of 
		 * firstInt ( or secondInt ) and quotient to double.
		 * i.e 200.0 / 9 = 2.2222...
		 * if program wanted to display the remainder, would use firstInt % secondInt.
		 * i.e 200 / 9 = 22 with a remainder of 2.
		*/
		int quotient = firstInt / secondInt;
		
		//display the results of dividing the larger int data type  by the smaller int data type
		System.out.print("The quotient of " + firstInt + " divided by " + secondInt + " is " + quotient);
		

	}

}
