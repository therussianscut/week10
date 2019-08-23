/**
 * 
 */

/**
 * @author sean_
 *
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "antartic", 919, 13, 13);

		Whale[] array = { w1, w2, w3, w4 };
		outputAll(array);
		atlanticWhales(array);
		fastestWhale(array);
		averageLength(array);
		heaviestWhale(array);
		screenOutput(array);
	}

	public static void outputAll(Whale[] array) {
		for (int loop = 0; loop < array.length; loop++) {
			System.out.println(array[loop].toString());
		}
	}

	public static void atlanticWhales(Whale[] array) {

		for (int loop = 0; loop < array.length; loop++) {
			if (array[loop].getMainOcean().equalsIgnoreCase("atlantic")) {
				System.out.println("Atlantic ocean whales are:\t" + array[loop].getName());
			}

		}

	}

	public static void fastestWhale(Whale[] array) {
		int fastest = array[0].getMaxSpeed();

		for (int loop = 0; loop < array.length; loop++) {
			if (array[loop].getMaxSpeed() > fastest) {
				fastest = array[loop].getMaxSpeed();
				System.out.println("The fastest whale is: " + array[loop].getName());
			}
		}
	}

	public static void averageLength(Whale[] array) {

		int total = 0;

		try {
			for (int loop = 0; loop < array.length; loop++) {

				total += array[loop].getLength();

			}
			double average = total / array.length;
			System.out.println("The average length is: " + average + " meters");
		} catch (Exception ex) {
			System.out.println(" error!!!");
		}
	}

	public static void heaviestWhale(Whale[] array) {

		int heaviest = array[0].getWeight();

		for (int loop = 0; loop < array.length; loop++) {
			if (array[loop].getWeight() >= heaviest) {
				heaviest = array[loop].getWeight();
				System.out.println("The name of the heaviest whale is: " + array[loop].getName());
			}

		}

	}
	
	public static void screenOutput(Whale[] array) {
		
		for (Whale random: array) {
			System.out.println(random);
		}
	}

}
