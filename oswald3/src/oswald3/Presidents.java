//Leah Oswald SPC ID#2420610
//Program that asks user for the first and last name of any of the last three presidents.
//Program checks if input is correct and displays the presidents sequence or displays incorrect.

package oswald3;

import java.util.Scanner;

public class Presidents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt user to enter first and last name of recent president
		System.out.println("Enter the first and last name of one of our three most recent presidents: ");

		// assigns users input to string president
		// from zoom meeting chapter 3
		String president = input.nextLine();

		// from chapter3 instructor zipped examples, examplefive.java
		// changes input to lower case
		president = president.toLowerCase();

		// switch to test string president against three correct inputs
		switch (president) {
		case "donald trump":
			// displays presidents sequence and input is correct
			System.out.print("45th president, " + president + " is a corrrect input");
			break;
		case "barack obama":
			System.out.print("44th president, " + president + " is a corrrect input");
			break;
		case "george bush":
			System.out.print("43rd president, " + president + " is a corrrect input");
			break;

		// if incorrect will display by default
		default:
			System.out.println(president + " is incorrect");

		}
		input.close();

	}

}
