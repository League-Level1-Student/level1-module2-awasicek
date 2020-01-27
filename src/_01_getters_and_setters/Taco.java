package _01_getters_and_setters;

public class Taco {
	// 1: Create a class called Taco, then add 2 private String member variables for the meat and sauce.
	private String meat;
	private String sauce;

	// 2: Create methods getMeat() and getSauce() that return the member variables.
	public String getMeat() {
		return meat;
	}
	
	public String getSauce() {
		return sauce;
	}

	// 3: Create methods setMeat(String meat) and setSauce(String sauce) that set the values of the members variables to the values passed in the method parameters. 
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
}
