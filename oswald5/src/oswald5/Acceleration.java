//Leah Oswald SPC ID#2420610
//Program that displays a table of time, velocity, and distance.
//Program does the calculations and formats the output.

package oswald5;

public class Acceleration {

	public static void main(String[] args) {
		//Constant.
		final double GRAVITY = 32.17;
		//Declared variables.
		int time;
		double velocity, distance;
		
		//Describe the program and display it to user.
		System.out.println("Acceleration due to Gravity Table for a falling object\n"
				+ "Time: seconds, Velocity: feet per second, Distance: feet");
		
		//Display the headings for the table.
		System.out.printf("%5s %10s %10s\n", "Time", "Velocity", "Distance");
		
		//For loop that starts and 0 and increments till 10.
		for (time = 0; time <= 10; time++)
		{
			//Calculate velocity.
			velocity = GRAVITY * time;
			//Calculate distance.
			distance = (velocity * time) / 2;
			//Display results in columns with a width of 5, 10 and 10. Format to 2 decimal places.
			System.out.printf("%5d %10.2f %10.2f\n", time, velocity, distance);
		}

	}

}
