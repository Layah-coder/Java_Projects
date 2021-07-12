/*******************************************************************
 * Leah Oswald
 * SPC ID # 2420610
 * Custom class of Florida governors.
 ********************************************************************/
package oswald19;

public class Governor implements Comparable<Governor> {
	
	protected String lastName;
	protected String firstName;
	protected int yearElected;

	
	public Governor(String last, String first, int elected){
		this.firstName = first;
		this.lastName = last;
		this.yearElected = elected;

	}
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int yearElected() {
		return yearElected;
	}	


	@Override
	public String toString() {
		return firstName + " " + lastName + "\n\nYear Elected:\n" + yearElected;
	}

	@Override
	public int compareTo(Governor gov) {
		if (yearElected() > gov.yearElected())
			return 1;
		else if (yearElected() < gov.yearElected())
			return -1;
		else 
			return 0;
	}
	

}
