//Leah Oswald SPC ID#2420610
//Class Desktop that extends parent class Computer.

package oswald11;

//Inherit from Computer class.
public class Desktop extends Computer{
	//Private attributes.
	private String monitor;
	private String keyboard;
	//Constructor that accepts string, CPU, int, string, double, string, string as parameters.
	public Desktop(String makeModel, CPU cpu, int memory, String storage, double price, String monitor, String keyboard) {
		//Call super method with arguments.
		super(makeModel, cpu, memory, storage, price);
		//Assign values to private attributes.
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		//Returns the parent class toString and Desktop attributes.
		return 	super.toString() + " monitor " + monitor + " KB " + keyboard;
	}
	
	

}
