/*******************************************************************
 * Leah Oswald
 * SPC ID # 2420610
 * Program that tests a method on an API class and a custom class.
 * Method returns maximum value.
 ********************************************************************/
package oswald19;

import java.util.ArrayList;
import java.util.Collections;

public class GenericMax {

	public static void main(String[] args) {
		//Create ArrayList that holds custom class object.
		ArrayList<Governor> govs = new ArrayList<>();
		//Fill ArrayList govs.
		Governor govOne = new Governor("DeSantis", "Ronald", 2019);
		govs.add(govOne);
		Governor govTwo = new Governor("Scott", "Richard", 2011);
		govs.add(govTwo);
		Governor govThree = new Governor("Crist", "Charlie", 2007);
		govs.add(govThree);
		Governor govFour = new Governor("Bush", "John", 1999);
		govs.add(govFour);
		Governor govFive = new Governor("MacKay", "Kenneth", 1998);
		govs.add(govFive);
		
		
		//Call method to check for errors and find max value.
		Governor maximumGovs = max(govs);
		//Display results.
		System.out.println("Most recent Governor of Florida:\n" + maximumGovs);
		
		//Create an ArrayList of Integer data types.
		ArrayList<Integer> integers = new ArrayList<>(); 	
		//Fill ArrayList integers.
		integers.add(10);
		integers.add(9);
		integers.add(51);
		integers.add(50);
		integers.add(202);
		integers.add(1);
		//Call method to check for errors and find max value.
		int maximumInts = max(integers);
		//Display results.
		System.out.println("\n\nThe largest int in the array list is " + maximumInts + ".\n");
		
	}
	//Static method that accepts ArrayList of an object that extends Comparable.
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
			//Assign first index to max.
		   E max = list.get(0);
		   //Loop through arraylist.
	        for (int i = 1; i < list.size(); i++) {
	        	//Compare elements.
	            if (list.get(i).compareTo(max) > 0) {
	            	//Assign new element to max if true.
	                max = list.get(i);
	            }
	        }
		//Return max.
		return max;
    
		
	}

}
