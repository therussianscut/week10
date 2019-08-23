/**
 * 
 */

/**
 * @author sean_
 *
 */
public class SimpsonsCharacter {

	// instance vars
	private String name;
	private String catchPhrase;

	// default constructor
	public SimpsonsCharacter() {

	}

	/**
	 * @param name
	 * @param catchPhrase
	 */
	public SimpsonsCharacter(String name, String catchPhrase) {
		this.name = name;
		this.catchPhrase = catchPhrase;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}

	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SimpsonsCharacter [name=" + name + ", catchPhrase=" + catchPhrase + "]";
	}

	public void sayCatchPhrase() {

		System.out.println(this.name + " says " + this.catchPhrase);
		
	}

}
