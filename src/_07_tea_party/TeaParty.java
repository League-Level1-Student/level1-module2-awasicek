package _07_tea_party;

public class TeaParty {

	/* 
	 * If the guest has been knighted by the Queen and is male, use the title "Sir" before their name to greet them, 
	 * otherwise if the guest is a male, use the title "Mr." before their name.
	 * 
	 * If the guest has been knighted by the Queen and is female, use the title "Lady" before their name to greet 
	 * them, otherwise if the guest is a female, use the title "Ms." before their name.
	 */

	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting;
        if(isKnighted && !isWoman) {
        	greeting = "Hello Sir " + name;
        } else if(!isWoman) {
        	greeting = "Hello Mr. " + name;
        } else {
        	greeting = "Hello Ms. " + name;
        }
        return greeting;
    }
}
