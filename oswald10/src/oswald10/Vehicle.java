//Leah Oswald SPC ID# 2420610
//Class Vehicle, uses object created from Motor class,
//has private fields, a parameterized constructor, gets and sets price,
//and a toString method.
package oswald10;

public class Vehicle {
	//Private fields.
	private String make;
	private String model;
	private int year;
	private double price;
	private Motor motor;
	
	//A constructor that can assign values to all attributes.
	public Vehicle(String make, String model, int year, double price, int cylinders, int hp, String type) {
		//Create object and invoke instance method.
		motor = new Motor(cylinders, hp, type);
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
	}
	//Getter for price.
	public double getPrice() {
		return price;
	}
	//Setter for price.
	public void setPrice(double price) {
		this.price = price;
	}
	//toString that returns all attributes of a Vehicle instance.
	@Override
	public String toString() {
		return "Vehicle make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + motor;
	}
	
	
	
	
	

}
