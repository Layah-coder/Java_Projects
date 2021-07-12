//Leah Oswald SPC ID#2420610
//Class Laptop that extends parent class Computer.

package oswald11;

//Inherit from Computer class.
public class Laptop extends Computer{
	//Private attributes.
	private String screen;
	private double weight;
	//Constructor that accepts string, CPU, int, string, double, string, double as parameters.
	public Laptop(String makeModel, CPU cpu, int memory, String storage, double price, String screen, double weight) {
		//Call super method with arguments.
		super(makeModel, cpu, memory, storage, price);
		//Assign values to private attributes.
		this.screen = screen;
		this.weight = weight;
	}
	@Override
	public String toString() {
		
		//Returns the parent class toString and Laptop attributes.
		return 	super.toString() + screen + " screen, " + "weight " + weight + "lb";
	}
	
	

}
