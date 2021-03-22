/**
* The Animal program implements an abstract application that
* gets extended to its subclasses. Animal Has-A relationship with Location.java.
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public abstract class Animal {
	protected int simID;
	protected Location location=new Location();
	protected boolean full;
	protected boolean rested;

	/**
	* Default constructor (abstract)
	* @param unused
	*/
	public Animal() {
		simID=0;
		location.update(0,0);
		full=false;
		rested=true;
	}
	
	/**
	 * Preferred Constructor (abstract)
	* @param simID
	* @param Location
	* @exception InvalidSimIDException
	*/
	public Animal(int simID, Location I) {
		try {
			if (simID<0)
			throw new InvalidSimIDException("");
		this.simID=simID;
		location.update(I.getxCoord(),I.getyCoord());
		full=false;
		rested=true;
		}
		catch(InvalidSimIDException e) {
			System.out.println("Error: Parameters must been greater than 0");
		}
	}
	
	/**
	   * This is the eat method, which uses a random number to determine if full should
	   * be set to true or false
	   * @param args Unused.
	   * @return boolean
	   */
	public boolean eat() {
		double a=Math.random();
		if (a<=.5) {
			full=false;
			return full;
		}
		else {
			full=true;
			return full;
		}
	}
	
	/**
	   * This is the sleep method, which uses a random number to determine if rested should
	   * be set to true or false
	   * @param args Unused.
	   * @return boolean
	   */
	public boolean sleep() {
		double b=Math.random();
		if (b<=.5) {
			rested=false;
			return false;
		}
		else {
			rested=true;
			return true;
		}
	}
	
	
	/**
	 * @return the coordinates of location
	 */
	public int[] getLocation() {
		return location.getCoordinates();
	}
	
	/**
	 * @param int a and int b to set the coordinates of location
	 */
	public void setLocation(int a, int b) {
		location.update(a, b);
	}

	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}

	/**
	 * @param simID the simID to set
	 * @exception InvalidSimIDException
	 */
	public void setSimID(int simID) {
		try {
			if (simID<0)
			throw new InvalidSimIDException("");
		this.simID = simID;
		}
		catch(InvalidSimIDException e) {
			System.out.println("Error: Parameters must been greater than 0");
		}
	}

	/**
	 * @return the full
	 */
	public boolean isFull() {
		return full;
	}

	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}

	/**
	 * @return the rested
	 */
	public boolean isRested() {
		return rested;
	}

	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
	
}
