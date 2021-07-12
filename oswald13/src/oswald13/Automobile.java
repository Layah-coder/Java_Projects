package oswald13;

public class Automobile implements Comparable<Automobile> {
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	public Automobile(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return make + " " + model + " " + year + " $" + String.format("%,.2f", price);
	}
	
	@Override
	public int compareTo(Automobile auto) {
		if (getYear() > auto.getYear())
			return 1;
		else if (getYear() < auto.getYear())
			return -1;
		else 
			return 0;
	}

}
