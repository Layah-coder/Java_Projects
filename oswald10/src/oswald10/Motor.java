//Leah Oswald SPC ID# 2420610
//Class Motor, has private fields, a parameterized constructor, getters, and a toString.
package oswald10;

public class Motor {
	//Private Fields.
	private int cylinders;
	private int hp;
	private String type;
	//Constructor to assign values to all attributes/fields.
	public Motor(int cylinders, int hp, String type) {
		this.cylinders = cylinders;
		this.hp = hp;
		this.type = type;
		
	}
	//Getters for all attributes.
	public int getCylinders() {
		return cylinders;
	}
	public int getHp() {
		return hp;
	}
	public String getType() {
		return type;
	}
	//tostring method that returns all attributes of a Motor instance.
	@Override
	public String toString() {
		return " cylinders=" + cylinders + ", hp=" + hp + ", type=" + type;
	}
	

	
	
	
	
	
	

}
