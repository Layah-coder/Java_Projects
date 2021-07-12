//Leah Oswald SPC ID# 2420610
//Program that accepts two sides of a triangle as command line arguments and displays the hypotenuse.

package oswald7and11;

public class CommandLine {

	public static void main(String[] args) {
		//Close the program if the number of arguments are not 2.
		if (args.length != 2) {
			System.exit(1);
		}
		//Parse the argument strings into int variables.
		int side1 = Integer.parseInt(args[0]);
		int side2 = Integer.parseInt(args[1]);
		//Calculate the hypotenuse and assign to double variable.
		double hypotenuse = (Math.sqrt(Math.pow(side1, 2) + (Math.pow(side2, 2))));
		//Display the results accurate to 2 decimal places.
		System.out.printf("Side 1: %d\n" + "Side 2: %d\n" + "Hypotenuse: %.2f", side1, side2, hypotenuse);
		}

	

}
