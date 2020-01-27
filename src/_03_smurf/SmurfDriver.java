package _03_smurf;

public class SmurfDriver {
	public static void main(String[] args) {
		 // * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
		Smurf handy = new Smurf("Handy");
		handy.eat();
		System.out.println(handy.getName());
		
		 // * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		Smurf papa = new Smurf("Papa");
		System.out.println("My name is " + papa.getName() + " I wear a " + papa.getHatColor() + " hat and I am a " + papa.isGirlOrBoy() + ".");
		
		 // * 6. Make a Smurfette and print her name, hat color and girl or boy. 
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println("My name is " + smurfette.getName() + " I wear a " + smurfette.getHatColor() + " hat and I am a " + smurfette.isGirlOrBoy() + ".");
	}
}
