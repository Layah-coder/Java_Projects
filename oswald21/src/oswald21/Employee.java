/*
 * Leah Oswald SPC ID# 2420610
 * Employee class
 * */

package oswald21;

public class Employee {

	//Private attributes.
	private String id;
	private String lastName;
	private String firstName;
	private int salary;

	//Parameterized constructor.
	public Employee(String id, String lastName, String firstName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}

	//Getters for all attributes.
	public String getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getSalary() {
		return salary;
	}

	//toString method that displays attributes.
	@Override
	public String toString() {
		return "ID #: " + id + " "+ lastName + ", " + firstName + " $"+ salary;
	}



}

