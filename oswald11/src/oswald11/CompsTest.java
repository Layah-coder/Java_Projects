//Leah Oswald SPC ID#2420610
//Main program that creates computers as objects, adds them to an array.
//Adds array to an arraylist and displays contents of arraylist.

package oswald11;
//Needed for ArrayList.
import java.util.ArrayList;
import java.util.Arrays;

public class CompsTest {

	public static void main(String[] args) {
		//Create CPU objects and pass arguments.
		CPU cpuFirst = new CPU("Intel Xeon (2)", 2.7, 28);
		CPU cpuSecond = new CPU("AMD Ryzen", 3.8, 24);
		CPU cpuThird = new CPU("Intel i7", 3.0, 8);
		CPU cpuFourth = new CPU("Intel i5", 1.4, 4);
		CPU cpuFifth = new CPU("Intel i7", 2.3, 4);
		CPU cpuSixth = new CPU("Intel Celeron", 1.1, 1);
		CPU cpuSeventh = new CPU("Intel i7", 1.3, 4);

		//Create Computer/Desktop/Laptop objects and pass arguments.
		//Declared type Computer and actual type Computer.
		Computer first = new Computer ("Silverdraft Demon", cpuFirst, 192, "1 TB SSD, ", 49500.00);
		//Declared type Computer and actual type Desktop.
		Computer second = new Desktop("CyberPowerPC ThreadRipper", cpuSecond, 32, "500 GB HD, ", 3329.00, "None,", "Gaming");
		//Declared type Desktop and actual type Desktop.
		Desktop third = new Desktop("Asus ROG Strix GL12", cpuThird, 8, "500 GB SSD, ", 1299.00, "None,", "Aurora-Sync");
		//Declared type Computer and actual type Laptop.
		Computer fourth = new Laptop("Apple MacBook Pro", cpuFourth, 8, "256 GB SSD, ", 1299.00, ", 13.3 in", 3.1);
		//Declared type Computer and actual type Laptop.
		Computer fifth = new Laptop("Lenova Yoga", cpuFifth, 12, "512 GB SS, ", 899.99, ", 14 in", 2.98);
		//Declared type Laptop and actual type Laptop.
		Laptop sixth = new Laptop("Samsung Chromebook", cpuSixth, 4, "32 GB eMMC, ", 299.00, ", 15.6 in.", 3.75);
		//Declared type Laptop and actual type Laptop.
		Laptop seventh = new Laptop("Razer Blade Stealth", cpuSeventh, 16, "512 GB SSD, ", 1599.99, ", 13.3 in.", 3.11);
		
		//Create array of type Computer called compArray.
		Computer[] compArray = {first,second,third,fourth,fifth,sixth,seventh};
		//Create arraylist of type Computer called compList.
		ArrayList<Computer> compList = new ArrayList<>(Arrays.asList(compArray));
		//Enhanced for loop of elements in compList.
		for (Computer i : compList) {
			//Print element.
			System.out.println(i);
			
		}

	}

}
