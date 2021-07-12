

//Leah Oswald SPC ID# 2420610
/*Program that accepts user input of a byte value,
 * casts as int then char,
 * displays character or ends program with error message.
 */
package oswald12;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		//Create scanner.
		Scanner input = new Scanner(System.in);
			//Execute if no runtime errors.
			try {
				//Prompt user for a byte.
				System.out.println("Enter a positive byte value ");
				//Assign user input to numberB.
				byte numberB = input.nextByte();
				//Casts to an int.
				int numberInt = (int) numberB;
				//Casts to a char.
				char numberChar = (char)numberInt;
				//Check if user input is an ASCII printable character.
				if (numberB > 31 && numberB < 124) {
					//Display ASCII character.
					System.out.println("In ASCII, that character is " + numberChar);
				}
			}
			//Graceful ending for runtime errors.
			catch(Exception ex) {
				//Error message.
				System.out.println("Bad input. Run program again");
			}			
			//Always execute.
			finally {
			//Close input.
			input.close();
			}
		}

	}


