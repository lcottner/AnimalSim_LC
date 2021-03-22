/**
* The Goldfinch program extends Animal and implements both Walkable and Flyable.
*It represents a goldfinch. 
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class Goldfinch extends Animal implements Walkable, Flyable{
	private double wingSpan;
	
	/**
	* Default constructor 
	* @param unused
	*/
	public Goldfinch() {
		simID=0;
		location.update(0,0);
		full=false;
		rested=true;
		wingSpan=9.0;
	}
	
	/**
	 * Preferred Constructor
	* @param simID
	* @param Location
	* @param ws
	* @exception InvalidSimIDException
	* @exception InvalidWingspanException
	*/
	public Goldfinch(int simID, Location I, double ws) {
		try {
		if (simID<0)
			throw new InvalidSimIDException("");
		if (ws<=5.0 || ws>=11.0)
			throw new InvalidWingspanException("");
		this.simID=simID;
		location.update(I.getxCoord(),I.getyCoord());
		full=false;
		rested=true;
		wingSpan=ws;
		}
		catch(InvalidSimIDException e) {
			System.out.println("Error: Parameters must been greater than 0");
		}
		catch (InvalidWingspanException e) {
			System.out.println("Error: Wingspan should be between 5.0 and 11.0 cm");
		}
		
	}
	
	/**
	 * This is the fly method, which updates the coordinates to those in the passed Location
	 * @param Location
	 * @return nothing
	 */
	public void fly(Location L) {
		location.update(L.getxCoord(), L.getyCoord());
	}
	

	/**
	   * This is the walk method, which uses an int to determine direction and move
	   * 1 units accordingly.
	   * @param int direction 1=north, 2=east, 3=south, 4=west
	   * @return nothing.
	   */
	public void walk(int a) {
		if (a==1)
			location.setyCoord(location.getyCoord()+1);
		if (a==2)
			location.setxCoord(location.getxCoord()+1);
		if (a==3)
			location.setyCoord(location.getyCoord()-1);
		if (a==4)
			location.setxCoord(location.getxCoord()-1);
	}

	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}

	/**
	 * @param wingSpan the wingSpan to set
	 * @exception InvalidWingspanException
	 */
	public void setWingSpan(double wingSpan) {
		try {
		if (wingSpan<=5.0 || wingSpan>=11.0)
			throw new InvalidWingspanException("");
		this.wingSpan = wingSpan;
		}
		catch (InvalidWingspanException e) {
			System.out.println("Error: Wingspan should be between 5.0 and 11.0 cm");
		}
	}
	
}
