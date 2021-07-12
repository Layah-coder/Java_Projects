//Leah Oswald SPC ID# 2420610
// program that prompts user for hourly pay rate and hours worked, then outputs pay
package oswald1and2;

//import for use of scanner
import java.util.Scanner;

public class CalculatePay {

	//create main method
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for hourly pay rate
		System.out.print("Enter hourly pay rate: ");
		
		//assigns user input to double variable called hourlyPayRate
		double hourlyPayRate = input.nextDouble();
		
		//prompt user for hours worked
		System.out.print("Enter hours worked: ");
		
		//assigns user input to double variable(can work part of an hour) called hoursWorked
		double hoursWorked = input.nextDouble();
		
		//close scanner
		input.close();
		
		//calculates hourlyPayRate * hoursWorked and assigns answer to grossPay
		double grossPay = hourlyPayRate * hoursWorked;
		
		//displays grossPay
		System.out.print("Weekly pay is $" + grossPay);

	}

}
