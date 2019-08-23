/**
 * 
 */

/**
 * @author sean_ sean mccann 12595985
 */
public class Flight {

	private String flightNumber;
	private String Destination;
	private String Origin;
	private double duration;

	// default constructor
	public Flight() {

	}

	/**
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration     constructor with args.
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {

		this.flightNumber = flightNumber;
		Destination = destination;
		Origin = origin;
		this.setDuration(duration);
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return Destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		Destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return Origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		Origin = origin;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 * validation for duration setter.
	 */
	public void setDuration(double duration) {
		if (duration <= 18) {
			this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Invalid duration, your not travelling from Perth to London");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", Destination=" + Destination + ", Origin=" + Origin
				+ ", duration=" + duration + "]";
	}

}
