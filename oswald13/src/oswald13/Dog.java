/* Leah Oswald SPC ID # 2420610
 *Subclass Dog that inherits from Pet and implements Mobility and Comparable.
 */
package oswald13;

import java.util.Date;

public class Dog extends Pet implements Mobility, Comparable<Dog> {
	//Attributes only accessed by Dog.
	private String breed;
	private int weight;
	//Constructor that accepts Pet and Dog attributes.
	public Dog(String name, char gender, Date aquired, String breed, int weight) {
		//Call super to get values from Pet class.
		super(name, gender, aquired);
		this.breed = breed;
		this.weight = weight;
	}
	//Getters.
	public String getBreed() {
		return breed;
	}
	public int getWeight() {
		return weight;
	}
	//Methods that return String.
	public String move(){
		return "Walks on a Leash, ";
	}
	public String sound(){
		return "Barks or howls, ";
	}
	//Return local and super attributes.
	@Override
	public String toString() {
		return "Dog name = " + super.name + ", " + breed + ", " + super.gender + "\n"
				+ move() + "weight " + weight + "\n" + sound() + super.acquired;
	}

	//compareTo method of the Comparable interface that uses weight to compare.
	@Override
	public int compareTo(Dog o) {
		//Returns 1 if current Dog weight > next index of Dog.
		if (getWeight() > o.getWeight())
			return 1;
		//Returns -1 if current weight < next index.
		else if (getWeight() < o.getWeight())
			return -1;
		//Returns if equal.
		else 
			return 0;
		}
	}
