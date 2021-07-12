//Leah Oswald SPC ID#2420610
//Class Computer 'has a' CPU relationship.
package oswald11;

public class CPU {
	//Private attributes.
	private String makeModel;
	private double clock;
	private int cores;
	//Constructor that accepts string, double, int. as parameters.
	public CPU(String makeModel, double clock, int cores) {
		//Assign values to private attributes.
		this.makeModel = makeModel;
		this.clock = clock;
		this.cores = cores;
	}
	@Override
	public String toString() {
		//Returns local attributes.
		return makeModel + " " + cores + " cores " + clock + " GHz CPU, ";
	}
	
	

}
