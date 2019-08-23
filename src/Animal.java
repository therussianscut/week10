/**
 * 
 */

/**
 * @author sean_
 *
 */
public class Animal {
	
	private String name;
	// default constructor
	public Animal() {
		
	}

	
	
	/**
	 * @param name
	 * constructor with args
	 */
	public Animal(String name) {
		
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
