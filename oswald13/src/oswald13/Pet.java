/* Leah Oswald SPC ID # 2420610
 * Super class Pet with abstract constructor.
 */
package oswald13;
//Needed for Date data type.
import java.util.Date;

public abstract class Pet  {
//Fields that can be accessed by Pet and its subclasses.
protected String name;
protected char gender;
protected Date acquired;
//Constructor that accepts attributes of Pet.
public Pet(String name, char gender, Date acquired) {
	//Assigns values to local variables.
	this.name = name;
	this.gender = gender;
	this.acquired = acquired;
	
}
//Getters.
public String getName() {
	return name;
}

public char getGender() {
	return gender;
}

public Date getAcquired() {
	return acquired;
}
//Abstract method.
public abstract String sound();



}
