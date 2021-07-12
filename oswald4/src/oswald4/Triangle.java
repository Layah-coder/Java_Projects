//Leah Oswald SPC ID# 2420610
//Program will calculate the length of a right triangles side b 
//and two other angles given sides a and c.

package oswald4;

public class Triangle {

	public static void main(String[] args) {
		
		//For side a, assign the value 12 to a double variable.
		double a = 12.0;
		
		//For the side c, assign the value 37 to a double variable.
		double c = 37.0;
		
		//To calculate side b, use the class Math.sqrt of (c^2 - a^2).
		double b = Math.sqrt((c * c) - (a * a));
		
		//To calculate sinA.
		double sinA = a / c;
		
		//Use the class Math.asin to return the inverse of sinA in radians.		
		double radA = Math.asin(sinA);
		
		//Use the class Math.toDegrees to return angleA in degrees for radA.
		double angleA = Math.toDegrees(radA);
		
		//Calculate angle B by subtracting angleA from 90.
		double angleB = 90 - angleA;
		
		//Display output of side b, angle a, and angle b.
		//Use printf() and show two decimal places.
		System.out.printf("Side b is %.2f\n", b);
		System.out.printf("Angle A is %.2f degrees\n", angleA);
		System.out.printf("Angle B is %.2f degrees\n", angleB);
		
		

	}

}
