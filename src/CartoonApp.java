/**
 * 
 */

/**
 * @author sean_
 *
 */
public class CartoonApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpsonsCharacter bart= new SimpsonsCharacter("Bart", "Eat my shorts!");
		SimpsonsCharacter homer= new SimpsonsCharacter("Homer", "D'oh!");
		SimpsonsCharacter Lisa= new SimpsonsCharacter("Lisa", "I'll be in my room");
		SimpsonsCharacter Nelson= new SimpsonsCharacter("Nelson", "HaHa");
		
		bart.sayCatchPhrase();
		homer.sayCatchPhrase();
		Lisa.sayCatchPhrase();
		Nelson.sayCatchPhrase();

	}

}
