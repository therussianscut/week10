/**
 * 
 */

/**
 * @author sean_
 *
 */
public class Car {
	//instance vars
	
	private String make;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;
	
	
	//default constructor
	public Car() {
		
	}

	/**
	 * @param make
	 * @param model
	 * @param colour
	 * @param numberOfDoors
	 * @param engineSize
	 * @param maxSpeed
	 * @param started
	 */
	public Car(String make, String model, String colour, int numberOfDoors, double engineSize, int maxSpeed) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
		this.maxSpeed = maxSpeed;
		
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}


	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}


	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	/**
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}


	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}


	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}


	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	/**
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}


	/**
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		
		this.started = started;
		
	}
	
	public void startCar() {
		if (this.started) {
			System.out.println("Car already started!!");
		} else {
		this.started=true;
		System.out.println("Car Started");
		}
		
	}
	
	public void stopCar() {
		if (!this.started){
			// car already stopped
			System.out.println("Engine is already stopped");
		} else {
			this.started=false;
			System.out.println("Car stopped");
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}
	
	

}
