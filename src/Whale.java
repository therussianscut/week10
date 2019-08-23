/**
 * 
 */

/**
 * @author sean_
 *
 */
public class Whale extends Animal {

	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	/**
	 * default constructor
	 */
	public Whale() {

	}

	/**
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 * 
	 * constructor with args
	 */
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.setMaxSpeed(maxSpeed);
		this.setLength(length);
	}

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}

	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
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

		if (maxSpeed > 10 && maxSpeed < 45) {
			this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = -999;
			System.out.println("invalid speed entered!!");
		}
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		if (length>10 && length<50) {
		this.length = length;
		} else {
			this.length=-999;
			System.out.println("invalid length entered!");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Whale Type Name= " + getName() + ", mainOcean= " + mainOcean + ", weight= " + weight + ", maxSpeed= " + maxSpeed + ", length= " + length;
	}

}
