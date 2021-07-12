// Leah Oswald SPC ID #2420610
// Program  will generate a random integer between 20-100 inclusive.
//Program will display the number with its correct ordinal.

package oswald3;

public class RandomOrdinal {

	public static void main(String[] args) {

		// generate a random integer between 20-100 inclusive
		int number = (int) (Math.random() * 81) + 20;

		// divide number by 10 to get its ones digit and assign to variable int ordinal
		int ordinal = number % 10;

		// check if ordinal is a 1
		if (ordinal == 1) {
			// display the number with st
			System.out.println(number + "st");
		}
		// check if ordinal is a 2
		
		else if (ordinal == 2) {
			// display number with nd
			System.out.println(number + "nd");
		}

		// check if ordinal is a 3
		else if (ordinal == 3) {
			// display number with rd
			System.out.println(number + "rd");
		}

		// all other numbers display with th
		else {
			System.out.println(number + "th");
		}

	}

}
