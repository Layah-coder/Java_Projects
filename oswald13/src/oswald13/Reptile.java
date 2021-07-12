/* Leah Oswald SPC ID # 2420610
 *Subclass Reptile that inherits from Pet and implements Mobility.
 */
package oswald13;
//Needed to use Date object.
import java.util.Date;

public class Reptile extends Pet implements Mobility{
	//Attributes only accessed by Reptile.
	private String type;
	//Constructor that accepts Pet attributes and Reptile attributes.
	public Reptile(String name, char gender, Date acquired, String type) {
		//Call super to get values.
		super(name, gender, acquired);
		this.type = type;
	}
	//Method that returns String.
	public String move(){
		return "Must be caged, crawls or slithers";
	}
	public String sound(){
		return "Not much sound, maybe a hiss, ";
	}
	//Returns local Dog attributes and Pet attributes. 
	@Override
	public String toString() {
		return "Reptile name = " + super.name + ", " + type + ", " + 
				super.gender + "\n" + move() + "\n" + sound() + super.acquired;
	}




}
