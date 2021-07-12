//Leah Oswald SPC ID# 2420610
//program prompts user for temperature in Celsius and displays it in Fahrenheit

package oswald1and2;

//import to use scanner object
import java.util.Scanner;

public class TemperatureConversion {

	//create main method
	public static void main(String[] args) {
		
	//create scanner object	
	Scanner input = new Scanner(System.in);
	
	//prompt user for a temperature in Celsius
	System.out.print("Enter a temperature in Celsius(accepts decimals): ");

	//assign user input to double variable celsius
	double celsius = input.nextDouble();
	
	//close scanner
	input.close();
	
	//calculate Celsius to Fahrenheit
	double fahrenheit =  celsius * (9.0 / 5) + 32;
	
	//display results
	System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
	}

}
