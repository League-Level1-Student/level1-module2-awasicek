package _01_getters_and_setters;

public class Person {
	// 4. Create a Person class, with 2 member variables - name and superpower.
	private String name;
	private String superpower;

	// 5. Using the pattern in Part 1, add getter and setter methods for the member variables of the Person class.
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuperpower() {
		return superpower;
	}
	
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	
	// 7. Override the default toString() method by implementing a toString() method on the Person class that returns "<name> has mad <superpower> skills".
	@Override
	public String toString() {
		return this.name + " has mad " + this.superpower + " skills";
	}
}
