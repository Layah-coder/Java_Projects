//Leah Oswald SPC ID#2420610
//Program that generates a random number inclusive between 10-20.
//Program displays if number is even or odd.

package oswald3;

public class EvenOdd {

	public static void main(String[] args) {

		// generate a random integer between 10-20 inclusive
		int number = ((int) (Math.random() * 11) + 10);

		// display the number
		System.out.println(number);

		// use a conditional operator to test the number and display if it is even or
		// odd
		System.out.println((number % 2 == 0) ? "number is even" : "number is odd");

	}

}
