package _01_getters_and_setters;

public class PersonDriver {
	public static void main(String[] args) {
		// 6. Now, make a Runner class that creates 3 different people, sets their superpowers, and prints the value returned by the default toString() method.
		Person joe = new Person();
		joe.setName("Joe");
		joe.setSuperpower("flying");
		
		Person fred = new Person();
		fred.setName("Fred");
		fred.setSuperpower("mutant strength");
		
		Person mary = new Person();
		mary.setName("Mary");
		mary.setSuperpower("laser beams");
		
		System.out.println(joe);
		System.out.println(fred);
		System.out.println(mary);
	}
}
