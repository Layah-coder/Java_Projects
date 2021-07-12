//Leah Oswald SPC ID#2420610
//Parent class Computer.
package oswald11;

public class Computer {
	
//Protected attribute can be accessed from child classes.
protected String makeModel;
//Private attributes cannot be accessed outside this class.
private int memory;
private String storage;
private double price;
//Create cpu variable with the data type CPU.
private CPU cpu;

//Constructor that accepts string, CPU, int, string, double as parameters.
public Computer(String makeModel, CPU cpu, int memory, String storage, double price) {
	//Assign values to private attributes.
	this.cpu = cpu;
	this.makeModel = makeModel;
	this.memory = memory;
	this.storage = storage;
	this.price = price;
}

@Override
public String toString() {
//Returns Computer attributes and formats currency for 'price' with 2 decimal and thousands comma.
	return makeModel + " " + cpu + memory + " MB RAM, " + storage + "$" + String.format("%,.2f", price);
}


}
