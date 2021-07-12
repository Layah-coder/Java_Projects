//Leah Oswald SPC ID# 2420610
//Program that prompts user for a binary number.
//Converts to a decimal and displays the total.

package oswald5;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {

		//Declared variables.
		int binaryDecimal = 0;
		int total = 0;
		int ch = 0;
		
		//Scanner input to prompt user.
		Scanner input = new Scanner(System.in);
		
		//Prompts user for a binary number.
		System.out.print("Enter a binary number: ");
		//Assign user input to string variable.
		String binaryString  = input.nextLine();
		
		//For loop that continues till count = 0 by counting down from length of string - 1 .
		//count represents the index position.
		for(int count = binaryString.length() - 1; count >= 0; count--)
		{
			//If the char variable ch is '1' assign int value 1 to binaryDecimal and then increment ch.
			if(binaryString.charAt(ch++) == '1')
			{
				binaryDecimal = 1;
				
			}
			//If the char variable ch is not '1' then assign int value 0 to binaryDecimal.
			else
			{
				binaryDecimal = 0;
			}
			//Cast into an integer, assign to binaryDecimal, multiple binaryDecimal by 2^ count.
			binaryDecimal = binaryDecimal * (int) Math.pow(2, count);
			//Add binaryDecimal to accumulator variable, total.
			total += binaryDecimal;
		}
		//Display results.
		System.out.println(binaryString + " is "+ total + " in base-10 decimal.");

		input.close();

	}

}
