/**
 * 
 */

/**
 * @author sean_
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newark", 8.5);
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

	

		Flight[] flights = { f1, f2, f3, f4, f5 };
		
		for (int loop=0; loop<flights.length; loop++) {
			System.out.println(flights[loop].toString());
		}

		System.out.println("the flight number of flight 1 is" + flights[0].getFlightNumber());
		longestDuration(flights);
		flightDublin(flights);
		screenOutput(flights);
	}

	public static void longestDuration(Flight[] flights) {

		double longestFlight = flights[0].getDuration();

		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDuration() > longestFlight) {
				longestFlight = flights[loop].getDuration();
				System.out.println("The flight with the longest duration is: " + flights[loop].getDuration());
			}

		}

	}

	public static void flightDublin(Flight[] flights) {
		
		
		for (int loop=0; loop< flights.length; loop++) {
			if (flights[loop].getDestination().equalsIgnoreCase("dublin")) {
				System.out.println("Flight number going to Dublin is: " + flights[loop].getFlightNumber());
			}
		}
	}
	
	public static void screenOutput(Flight[] flights) {
		for (Flight tester: flights) {
			System.out.println(tester);
		}
	}
	
}
