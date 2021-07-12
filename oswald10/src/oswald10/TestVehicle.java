
//Leah Oswald SPC ID# 2420610
/* Program that creates a list of vehicles and their information,
 * then displays it. */
package oswald10;

import java.util.ArrayList;

public class TestVehicle {

	public static void main(String[] args) {
		
		//Create an array list and assign to vehicleList.
		ArrayList <Vehicle> vehicleList = new ArrayList<>();
		//Create a new element and assign values.
		Vehicle firstVehicle = new Vehicle("Chevrolet", "Camaro", 2012, 28000.0, 8, 323, "gas");
		//Add to vehicleList.
		vehicleList.add(firstVehicle);
		Vehicle secondVehicle = new Vehicle("Toyota", "Tundra", 2017, 29900.0, 8, 350, "gas");
		vehicleList.add(secondVehicle);
		Vehicle thirdVehicle = new Vehicle("Tesla", "Model 3", 2020, 33690.0, 0, 258, "electric");
		vehicleList.add(thirdVehicle);
		Vehicle fourthVehicle = new Vehicle("Ford", "Bronco", 2021, 28500.0, 4, 270, "gas");
		vehicleList.add(fourthVehicle);
		Vehicle fifthVehicle = new Vehicle("Chevrolet", "Express", 2020, 33865.0, 4, 341, "diesel");
		vehicleList.add(fifthVehicle);
		
		//foreach that displays Vehicle instances from arraylist.
		for(Vehicle i : vehicleList) {
			System.out.println(i);
		}

	}

}
