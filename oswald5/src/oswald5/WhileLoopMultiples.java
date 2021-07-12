//Leah Oswald SPC ID# 2420610
//Program starts checking for multiples of 19 or 23 beginning at 200.
//Displays 24 multiples in 4 rows with 6 columns.
//Total number of multiples should be displayed at the end.

package oswald5;

public class WhileLoopMultiples {

	public static void main(String[] args) {
		
		//Declare variables.
		int number = 200;
		int total = 0;  //Used as an accumulator.
		int count = 0;  //Used as a counter.
		
		//While loop that continues until 24 multiples are found.
		while (count < 24)
		{
			//If number is a multiple of 19 or 23 but not both.
			if ((number % 19 == 0) ^ (number % 23 == 0)) 
			{
				
				//Display number formatted 8 wide.
				System.out.printf("%8d", number);
				//Add multiples to an accumulated total.
				total += number;
				//Add to counter.
				count++;
				
				//If the remainder is 0 after dividing the number by 6, print a new line.
				//Ensures 6 multiples are printed on each line.
				if (count % 6 == 0)
				{
					System.out.println();
				}
				
			}
			//Increase the number.
			number++;
		}
		//Display the total of all the multiples.
		System.out.print("Total = " + total);

	}
}



