package oswald13;

import java.util.ArrayList;
import java.util.Collections;


public class TestAuto {

	public static void main(String[] args) {
		//Create an array list and assign to autoList.
		ArrayList <Automobile> autoList = new ArrayList<Automobile>();
		//Create a new element and assign values.
		Automobile firstAuto = new Automobile("Chevrolet", "Camaro", 2012, 28000.0);
		//Add to autoList.
		autoList.add(firstAuto);
		Automobile secondAuto = new Automobile("Toyota", "Tundra", 2017, 29900.73);
		autoList.add(secondAuto);
		Automobile thirdAuto = new Automobile("Tesla", "Model 3", 2020, 33690.37);
		autoList.add(thirdAuto);
		Automobile fourthAuto = new Automobile("Ford", "Bronco", 2021, 28500.03);
		autoList.add(fourthAuto);
		Automobile fifthAuto = new Automobile("Chevrolet", "Express", 2020, 33865.07);
		autoList.add(fifthAuto);
		
		//foreach that displays Automobile instances from arraylist.
		for(Automobile i : autoList) {
			System.out.println(i);

		}
		System.out.println();
		Collections.sort(autoList);
		for(Automobile i : autoList) {
			System.out.println(i);

		}
	}
}
