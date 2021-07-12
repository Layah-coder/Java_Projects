/* Leah Oswald SPC ID # 2420610
 *Driving class that creates and displays an array of pets.
 */
package oswald13;
//Needed for Date object.
import java.util.Date;

public class TestPet {

	public static void main(String[] args) {
		//Create new Date variable.
		Date date = new Date();
		//Create a Reptile and display it.
		Reptile firstReptile = new Reptile("Slinky", 'M', date, "rock python");
		System.out.println(firstReptile);
		//Create Dog objects with values.
		Dog first = new Dog("Butch", 'M', date, "Alsatian", 90);
		Dog second = new Dog("Pedro", 'M', date, "Chihuahua", 14);
		Dog third = new Dog("Sacha", 'F', date, "Beagle", 25);
		Dog fourth = new Dog("Marley", 'M', date, "Pug", 20);
		//Add Dog objects to an array.
		Dog[] dogArray = {first, second, third, fourth};
		//Sort the array.
		java.util.Arrays.sort(dogArray);
		System.out.println("All dogs sorted by weight");
		//Increment through array.
		for (Dog i : dogArray) {
			//Print element.
			System.out.println(i);

		}
	}
}
