/*******************************************************************
 * Leah Oswald
 * SPC ID # 2420610
 * Program that creates three arrays of different reference types and 
 * displays them with the amount of elements in the array.
 ********************************************************************/

package oswald19;

public class GenericTypeArray {

	public static void main(String[] args) {
		//Create an array of Integer data type.
		Integer[] integers = {10, 7, 9, 20, 88, 63};
		//Create an array of String data type.
		String[] strings = {"Biden", "Sanders", "Warren", "Buttigieg", "Klobuchar",
				"Bloomberg", "Gabbard", "Steyer", "Patrick", "Bennet", "Yang"};
		//Create an array of Double data types.
		Double[] doubles = {1.32, 11.2, 44.01};
		//Pass integers array as an argument to inArray static method and assign returned value to numbers.
		int number = inArray(integers);
		//Display numbers.
		System.out.println("\nThere are " + number + " elements in the Integer array.\n");
		number = inArray(strings);
		System.out.println("\nThere are " + number + " elements in the String array.\n");
		number = inArray(doubles);
		System.out.println("\nThere are " + number + " elements in the Double array.");
	}
	//Static method that accepts an array of generic type.
	public static <E> int inArray(E[] list) {
		//Loop through the array.
		for (int i = 0; i < list.length; i++)
			//Display elements of the array.
			System.out.print(list[i] + "  ");
		//Return the number of elements in the array.
		return list.length;
	}

}
