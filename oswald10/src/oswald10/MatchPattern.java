//Leah Oswald SPC ID# 2420610
/*Program that accepts user input uses regular expressions to match pattern: 
1 upper case character 
1 lower case character
1 upper case character 
1 lower case character
any 4 digits
2 or 3 lower case letters
2 upper case characters
1 digit
*/
package oswald10;

import java.util.Scanner;

public class MatchPattern {

	public static void main(String[] args) {
		//Prompt user for code.
		System.out.println("Enter the code pattern");
		//Create scanner object.
		Scanner input = new Scanner(System.in);
		//Assign user input to string, code.
		String code = input.nextLine();
		//Checks user input against regex.
		if(code.matches("[A-Z][a-z][A-Z][a-z]\\d{4}[a-z]{2,3}[A-Z]{2}\\d")) {
			//Prints correct input.
			System.out.println("Yes, " + code + " matches the pattern");
		}
		//Else prints incorrect input.
		else {
			System.out.println("Invalid code.");
		}
		//Close input.
		input.close();

	}

}
