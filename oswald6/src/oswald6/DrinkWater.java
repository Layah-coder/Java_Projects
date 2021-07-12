//Leah Oswald SPC ID# 2420610
//Program that demonstrates method overloading.
//Calculates how much water you should drink a day.
//Program will pass the arguments to methods and let the complier choose
//the best method invocation.

package oswald6;



public class DrinkWater {

	public static void main(String[] args) {
		
		

		//Call the method calculate and pass arguments 150.5(weight) and 30(minutes of exercise).
	    double ounces = calculateOunces(150.5, 30);
	    //Display results returned from calculate formatted to 2 decimal places.
		System.out.printf("\nYou should drink %.2f ounces of water per day.\n", ounces);
		//Calls method calculateBottles and passes 16(oz in a bottle) and ounces as arguments.
		int numberBottles = calculateBottles(16, ounces);
		System.out.printf("\nThat is %d bottles of water per day!", numberBottles);

	}
	//First calculateOunces method accepts int, double, double as parameters.  
	//This is not currently useful because it has an extra parameter.
	public static double calculateOunces(double weight, int minutes, double juice) {
		double ounces = (weight / 2) + (minutes * 2.5);
		System.out.print("The first calculateOunces method was used.");
		return ounces;
	}
	//Second calculateOunces method accepts two doubles as parameters.
	//This is not ideal because minutes is an int data type and more efficient use of memory.
	public static double calculateOunces(double weight, double minutes) {
		double ounces = (weight / 2) + (minutes * 2.5);
		System.out.print("The second calculateOunces method was used.");
		return ounces;
	}
	//Third calculateOunces method is the ideal choice because it accepts a double and an int.
    public static double calculateOunces(double weight, int minutes) {
		double ounces = (weight / 2) + (minutes * 2.5);
		System.out.print("The third calculateOunces method was used.");
		return ounces;
	}
	//First calculateBottles method has an int and double parameter
	//which is the most efficient use of memory.
	public static int calculateBottles(int bottle, double ounces) {
		int total = (int) Math.round(ounces / bottle);
		System.out.print("The first calculateBottles method was used.");
		return total;
	}
	//Second calculateBottles has a parameter of data type long. 
	//This is not currently useful because the data type is wrong.
	public static int calculateBottles(int bottle, long ounces) {
		int total = (int) Math.round(ounces / bottle);
		System.out.print("The second calculateBottles method was used.");
		return total;
	}

}
